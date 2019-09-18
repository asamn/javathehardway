#include <stdio.h>
#include <cs50.h>
#include <math.h>

int main(void)
{
   void print(void);
   print();

}

void print(void)
{

    printf("Enter Height\n");
    int height = get_int("");
    if (height >= 24 || height < 0) //24 max height
    {
        printf("ERROR\n");
        print();
    }

    else
    {
        int heightPosition = height; //4 maxheight, prints top to bottom
        int reverseHeightPosition = height; //4
        int lengthAdder = 1;
        int reverseLengthAdder = 1;



        while (heightPosition > 0) //height: 4, while 4 > 0,heightPosition
        {
    for (int i = 0; i < height - lengthAdder; i++) //i = 0, 0 < 4 - 1 -> i < 3, print three empty spaces ---------------> i = 0, i < 4 - 2 -> i < 2, prints two spaces next heightPosition
            {
            printf(" ");//prints empty space
    }
    lengthAdder = lengthAdder + 1; //adds length to blocks, removes space printed
    for(int i = height; i > height - (lengthAdder - 1); i--) //i = 4, i > 4 - (2 - 1) ----> i = 4, i > 3, i--, print once, -------------> i = 4, i > 4 - (3 - 1), print two times
    {
        printf("#");

    }
    heightPosition = heightPosition - 1; //keeps track of height position, moves position down

    reverseLengthAdder = reverseLengthAdder - 1;
    printf("  ");//prints big gap

    //does reverse side
    for(int i = height; i < height - (reverseLengthAdder - 1); i++)
    {
        printf("#");
    }

   reverseHeightPosition = reverseHeightPosition + 1;
   printf("\n");
    }
    }

}


/*




/*/