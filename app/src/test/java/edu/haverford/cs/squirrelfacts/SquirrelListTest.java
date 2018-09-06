package edu.haverford.cs.squirrelfacts;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

import edu.haverford.cs.squirrelfacts.Squirrel;
import edu.haverford.cs.squirrelfacts.SquirrelList;

public class SquirrelListTest {
    protected Squirrel mTestSquirrel;
    protected Squirrel mTestSquirrel2;
    protected Squirrel mTestSquirrel3;
    protected SquirrelList mEmptySquirrelList;

    public SquirrelListTest() {
        mTestSquirrel = new Squirrel("a","b","c");
        mTestSquirrel2 = new Squirrel ("e","f","g");
        mTestSquirrel3 = new Squirrel ("i","j","k");
        mEmptySquirrelList = new SquirrelList();
    }

    @Test
    public void list_startsLengthZero() {
        assertEquals(0, mEmptySquirrelList.size());
    }

    @Test
    public void list_addOneLengthOne() {
        assertEquals(1, mEmptySquirrelList.addToFront(mTestSquirrel).size());
    }

    @Test
    public void list_getBackFirst() {
        assertEquals(mTestSquirrel, mEmptySquirrelList.addToFront(mTestSquirrel).getFirst());
    }

    @Test
    public void list_notIsEmpty() {
        assertEquals(false, mEmptySquirrelList.addToFront(mTestSquirrel).isEmpty());
    }

    // Test that if you insert an item in the second position, `getItem` will return it properly
    @Test
    public void list_getBackInsertedPosition() {
        SquirrelList sl = mEmptySquirrelList;
        sl.addToFront(mTestSquirrel);
        sl.addToFront(mTestSquirrel2);
        sl.addToFront(mTestSquirrel2);
        assertEquals(mTestSquirrel,sl.getItem(2));
    }

    @Test
    public void list_removeLink() {
        SquirrelList sl = mEmptySquirrelList;
        sl.addToFront(mTestSquirrel3);
        sl.addToFront(mTestSquirrel2);
        sl.addToFront(mTestSquirrel);
        Iterator<Squirrel> i = sl.iterator();
        i.next();
        i.remove();
        assertEquals(mTestSquirrel3, sl.getItem(1));
    }

    @Test
    public void list_containsSquirrel() {
        mEmptySquirrelList.add(mTestSquirrel);
        assertEquals(true, mEmptySquirrelList.contains(mTestSquirrel));
    }

    @Test
    public void list_clearIsEmpty() {
        mEmptySquirrelList.add(mTestSquirrel);
        mEmptySquirrelList.clear();
        assertEquals(true, mEmptySquirrelList.isEmpty());
    }

    /**
     * Part 2: Failing test for iteration removal here..
     * TODO: change this from {testname} to your thoughtful name!!
     */
    @Test
    public void list_testname() {
        return;
    }
}
