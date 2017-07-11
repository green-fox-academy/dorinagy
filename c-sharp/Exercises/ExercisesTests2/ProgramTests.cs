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
    public class ProgramTests
    {
        [TestMethod()]
        public void IsAnagramTest()
        {
            Assert.IsTrue(Program.IsAnagram("alma", "lama"));
        }

        [TestMethod()]
        public void fibonacciTest()
        {
            Assert.Fail();
        }
    }
}