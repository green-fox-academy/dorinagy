using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Anagram
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Type in two strings.");
            string firstString = Console.ReadLine();
            string secondString = Console.ReadLine();
            if (Anagram.IsAnagram(firstString, secondString))
            {
                Console.WriteLine("YES, they are anagrams!");
            }
            else
            {
                Console.WriteLine("NO, they are not anagrams.");
            }
        }
    }
}
