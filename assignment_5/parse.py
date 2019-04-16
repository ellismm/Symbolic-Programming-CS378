import sys

if __name__ == "__main__":
	
	cl_val = sys.argv[1]

	weights = [5]*20

	scores = []
	
	for line in cl_val.split("\n"):
		sc = int(line.split(":")[1])
		scores.append(sc)

	print (sum([x*y for x,y in zip(scores, weights)]))