using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercises
{
    public class Program
    {
        public static void Main(string[] args)
        {
            string word1 = "alma";
            string word2 = "lama";

            Console.WriteLine(IsAnagram(word1, word2));
            Console.ReadLine();
        }



        public static bool IsAnagram(string string1, string string2)
        {

            char[] chars1 = string1.ToCharArray();
            char[] chars2 = string1.ToCharArray();

            Array.Sort(chars1);
            Array.Sort(chars2);

            return chars1.SequenceEqual(chars2);
        }

        public static int fibonacci(int n)
        {
            if (n <= 0)
            {
                return 0;
            }
            else if (n == 1)
            {
                return 1;
            }
            else
            {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
    }
}
