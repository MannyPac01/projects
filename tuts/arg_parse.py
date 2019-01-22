import sys, getopt

name = sys.argv
hFile = ''
dFile = ''

try:
    opts, args = getopt.getopt(sys.argv[1:],"h:d:")
except getopt.GetoptError as e:
    print(str(e))
    print("Usage: {} -h HeaderFile -d DataFile".format(sys.argv[0]))
    sys.exit(2)

###############################
# o == option
# a == argument passed to the o
###############################
# Display input and output file name passed as the args
for o, a in opts:
    if o == '-h':
        hFile = a
        print(hFile)
    elif o == '-d':
        dFile = a
        print(dFile)

# Display input and output file name passed as the args

print("Header file : {} and Data file: {}".format(hFile, dFile))