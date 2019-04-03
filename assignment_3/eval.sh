# !/bin/bash

declare -a excluded_list=("comments")

if [ -f "scores.csv" ]; then rm "scores.csv"; fi
if [ -d "comments" ]; then rm -rf "comments"; fi

mkdir -p comments

zero=0
for folder in *; do
	if [ -d ${folder} ]; then
		is_excluded=$(echo ${excluded_list[@]} | grep -o ${folder} | wc -w)      
		if [[ $is_excluded -eq $zero ]]; then
			echo ${folder}
			cd ${folder}
			
			cp ../formulas.clj .           
			# Test Questions 1 and 2
			if [ -f "test.clj" ]; then rm "test.clj"; fi
			touch "test.clj"
			echo "(load-file \"soln.clj\")" >> "test.clj"
			cat "../test_asg3.clj" >> "test.clj"
			out=$(clojure "test.clj")
			echo "${out}"
			
			# Test Question 3
			if [ -f "test_java.clj" ]; then rm "test_java.clj"; fi
            touch "test_java.clj"
            echo "(load-file \"soln.clj\")" >> "test_java.clj"
        	cat "../test_asg3_java.clj" >> "test_java.clj"
            fn_out=$(clojure "test_java.clj")
            
            # Testing the Java output
            if [ -f "test_java.java" ]; then rm "test_java.java"; fi
            touch "test_java.java"

        	echo "final class test_java{" >> "test_java.java"
        	echo "${fn_out}" >> "test_java.java"
        	cat "../main.java" >> "test_java.java"
        	javac "test_java.java"
        	java_out=$(java "test_java")
        	echo "${java_out}"
			cd ..
			score=$(python parse.py "$out" "$java_out")
			if [ ! -z "${score}" ]; then
				echo "${out}" > "comments/${folder}.txt"
				echo $folder, $score >> scores.csv
				#rm -rf ${folder}
			fi
		fi
	fi
done	