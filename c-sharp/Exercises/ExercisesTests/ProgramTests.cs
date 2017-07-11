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

        Dictionary<char, int> characterOccurence;

        [TestMethod()]
        public void IsAnagramTest()
        {
            Assert.IsTrue(Program.IsAnagram("alma", "lama"));
        }

       
        [TestMethod]
        public void TestCorrectNumber()
        {
            Assert.AreEqual(8, Program.fibonacci(6));
        }

        [TestMethod]
        public void TestZero()
        {
            Assert.AreEqual(0, Program.fibonacci(0));
        }

        [TestMethod]
        public void TestNegative()
        {
            Assert.AreEqual(0, Program.fibonacci(-2));
        }

        [TestMethod]
        public void TestCountLetters()
        {
            Program program = new Program();
            characterOccurence = program.Count("Greenfox");

            Assert.AreEqual(2, characterOccurence['e']);
        }
    }
}
