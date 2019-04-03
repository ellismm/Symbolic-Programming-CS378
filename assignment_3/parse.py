import sys

if __name__ == "__main__":
	
	cl_val = sys.argv[1]
	jv_val = sys.argv[2]

	weights = [7.5]*4 + [3.75]*4 + [5]*4 + [8.75]*4

	scores = []
	
	for line in cl_val.split("\n"):
		sc = int(line.split(":")[1])
		scores.append(sc)

	for line in jv_val.split("\n"):
		sc = int(line.split(":")[1])
		scores.append(sc)

	print (sum([x*y for x,y in zip(scores, weights)]))