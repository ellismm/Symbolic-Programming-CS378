# !/bin/bash

folder=$1
cwd=$(pwd)

echo ${folder}
cd ${folder}

cp ${cwd}/formulas.clj .           

# Test Questions 1 and 2
if [ -f "test.clj" ]; then rm "test.clj"; fi
touch "test.clj"
echo "(load-file \"soln.clj\")" >> "test.clj"
cat "${cwd}/test_asg3.clj" >> "test.clj"
out=$(clojure "test.clj")
echo "${out}"

# Test Question 3
if [ -f "test_java.clj" ]; then rm "test_java.clj"; fi
touch "test_java.clj"
echo "(load-file \"soln.clj\")" >> "test_java.clj"
cat "${cwd}/test_asg3_java.clj" >> "test_java.clj"
fn_out=$(clojure "test_java.clj")

# Testing the Java output
if [ -f "test_java.java" ]; then rm "test_java.java"; fi
touch "test_java.java"

echo "final class test_java{" >> "test_java.java"
echo "${fn_out}" >> "test_java.java"
cat "${cwd}/main.java" >> "test_java.java"
javac "test_java.java"
java_out=$(java "test_java")
echo "${java_out}"
cd ${cwd}

score=$(python parse.py "$out" "$java_out")
if [ ! -z "${score}" ]; then
	echo "Score: ${score}"
fi