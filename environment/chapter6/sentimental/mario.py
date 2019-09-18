import cs50
import math

while True:
    #
    print("Enter Height\n")
    height = cs50.get_int()
    if height >= 0 and height <= 23:
        # breaks free from the asking loop if right height, otherwise keeps asking
        break


for i in range(1, height + 1):
    # i adds each loop, height = 4 -> 1 - 5 -> spaces = 4 - 1 -> 3 spaces printed, blocks = 1, one block printed at end, no need to print spaces at other side, end="" controls newlines
    gapLength = 2
    blocks = i
    space = height - blocks

    print(" " * space, end="")
    print("#" * blocks, end="")

    print(" " * gapLength, end="")

    print("#" * blocks)