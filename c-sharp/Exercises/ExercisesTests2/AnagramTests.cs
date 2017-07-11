using Microsoft.VisualStudio.TestTools.UnitTesting;
using Exercises;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercises.Tests
{
    [TestClass()]
    public class AnagramTests
    {
      
        [TestMethod()]
        public void IsAnagramTest()
        {
            Assert.IsTrue(Program.IsAnagram("", ""));
        }
    }
}