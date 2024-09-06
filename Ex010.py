colors: list = ['black', 'white', 'red', 'blue']
print(colors[0])  # get
colors[0] = 'yellow', 'cyan' # set
print(colors[0]) # get(read)
print(colors)
for i in colors:
    print(i)
    # [:] -> slice operator
    sliced_colors = colors[1:]
    print(sliced_colors)
    numbers = list(range(0,1001))
    print(numbers)