using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Anagram
{
    public class Anagram
    {
        public static bool IsAnagram(string string1, string string2)
        {

            if (string.IsNullOrEmpty(string1) || string.IsNullOrEmpty(string2))
                return false;
            if (string1.Length != string2.Length)
                return false;

            String.Concat(string1.OrderBy(c => c));
            String.Concat(string2.OrderBy(c => c));

            char[] charArray1 = string1.ToLower().ToCharArray();
            char[] charArray2 = string2.ToLower().ToCharArray();

            Array.Sort(charArray1);
            Array.Sort(charArray2);

            string sortedString1 = new string(charArray1);
            string sortedString2 = new string(charArray2);

            if (sortedString1 == sortedString2)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
