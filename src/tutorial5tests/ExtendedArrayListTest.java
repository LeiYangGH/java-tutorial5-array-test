package tutorial5tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import tutorial5.ExtendedArrayList;

import java.util.Arrays;

class ExtendedArrayListTest
{

	// Add in tests here
	ExtendedArrayList<String> exList;

	@BeforeEach
	void setup()
	{
		exList = new ExtendedArrayList<>();
	}

	@Test
	void testSize()
	{
		assertTrue(exList.size() == 0);
	}

	@Test
	void testBackNull()
	{
		assertTrue(exList.back() == null);
	}

	@Test
	void testBack()
	{
		String s = "x";
		exList.add(s);
		assertTrue(exList.back() == s);
		s = "y";
		exList.add(s);
		assertTrue(exList.back() == s);
	}

	@Test
	void testPopBackNull()
	{
		assertTrue(exList.popBack() == null);
	}

	@Test
	void testPopBack()
	{
		exList.add("x");
		exList.add("y");
		assertTrue(exList.popBack() == "y");
		assertTrue(exList.popBack() == "x");
	}

	@Test
	void testRemoveNull()
	{
		assertTrue(exList.remove() == false);
	}

	@Test
	void testRemove()
	{
		exList.add("x");
		exList.add("y");
		assertTrue(exList.remove() == true);
		assertTrue(exList.size() == 1);
		assertTrue(exList.back() == "x");
		assertTrue(exList.remove() == true);
		assertTrue(exList.size() == 0);
	}

	@Test
	void testConstructorWithNum()
	{
		ExtendedArrayList<String> exList = new ExtendedArrayList<>(2);
		exList.add("x");
		assertTrue(exList.size() == 1);
		assertTrue(exList.back() == "x");
		exList.add("y");
		assertTrue(exList.size() == 2);
		assertTrue(exList.back() == "y");
		exList.add("z");
		assertTrue(exList.size() == 3);
		assertTrue(exList.back() == "z");
	}

	@Test
	void testConstructorWithCollection()
	{
		String[] data = { "x", "y", "z" };
		ExtendedArrayList<String> exList = new ExtendedArrayList<>(Arrays.asList(data));
		assertTrue(exList.size() == 3);
		assertTrue(exList.back() == "z");
		assertTrue(exList.get(0) == "x");
	}

	@Test
	void testConstructorWithEmptyCollection()
	{
		String[] data = {};
		ExtendedArrayList<String> exList = new ExtendedArrayList<>(Arrays.asList(data));
		assertTrue(exList.size() == 0);
	}

	@Test
	void testConstructorWithBigCollection()
	{
		int bigCount = 10000000;
		String[] data = new String[bigCount];
		for (int i = 0; i < bigCount; i++)
		{
			data[i] = String.valueOf(i + 1);
		}
		ExtendedArrayList<String> exList = new ExtendedArrayList<>(Arrays.asList(data));
		assertTrue(exList.size() == bigCount);
		assertTrue(exList.back().equals("10000000"));//why cannot use == ?
		assertEquals(exList.back(), "10000000");
	}

}
