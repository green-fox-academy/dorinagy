using Microsoft.VisualStudio.TestTools.UnitTesting;
using Anagram;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Anagram.Tests
{
    [TestClass()]
    public class AnagramTests
    {
        [TestMethod()]
        public void IsAnagramTest()
        {
           Assert.AreEqual(true, Anagram.IsAnagram("alma", "aalm"));
        }
    }
}
