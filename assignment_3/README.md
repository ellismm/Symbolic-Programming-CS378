# Evaluating Submission

To evaluate your submission against the grading script that will be used for final evaluation, follow these steps:

1. Extract all the files provided with the README into the folder that contains your submission folder named 'uteid'.
2. Open terminal and navigate to the folder that contains all the provided files and the submission folder.
3. Execute the command:

```
bash run_single.sh <path to submission folder named 'uteid'>
``` 
4. The script will output the result of all test cases as well as the final score for the whole submission.
5. Stack overflow errors are not handled by the script and if you get such errors, then it's possibly due to the fact that you missed a base case in your recursive function and would need to debug that.

Note: The script has been developed in accordance with the submission instructions posted on Piazza. So, if for some reason the script does not return the intended output, then check your submission format instead of modifying the script to make it. 