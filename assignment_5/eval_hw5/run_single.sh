# !/bin/bash

folder=$1
cwd=$(pwd)

echo ${folder}
cd ${folder}

if [ -f "test.clj" ]; then rm "test.clj"; fi
touch "test.clj"
echo "(load-file \"soln.clj\")" >> "test.clj"
cat "${cwd}/test_asg5.clj" >> "test.clj"
out=$(clojure "test.clj")
echo "${out}"

cd ..
score=$(python parse.py "$out")
if [ ! -z "${score}" ]; then
	echo "Score: ${score}"
fi