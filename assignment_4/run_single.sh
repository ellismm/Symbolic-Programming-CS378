# !/bin/bash

folder=$1
cwd=$(pwd)

echo ${folder}
cd ${folder}

# Test Questions 1 and 2
if [ -f "test.clj" ]; then rm "test.clj"; fi
touch "test.clj"
echo "(load-file \"soln.clj\")" >> "test.clj"
cat "${cwd}/test_asg4.clj" >> "test.clj"
out=$(clojure "test.clj")
echo "${out}"


# score=$(python parse.py "$out" "$java_out")
# if [ ! -z "${score}" ]; then
# 	echo "Score: ${score}"
# fi