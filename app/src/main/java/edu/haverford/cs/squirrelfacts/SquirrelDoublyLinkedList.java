package edu.haverford.cs.squirrelfacts;

import java.util.Iterator;

/**
 * TODO: Implement the rest of this iterator
 * Note that we extend from SquirrelIterator so that we do not duplicate the code in that class
 */
class SquirrelDoublyLinkedListIterator extends SquirrelIterator implements BackIterator<Squirrel> {
    public SquirrelDoublyLinkedListIterator(SquirrelLink firstLink) {
        super(firstLink);
    }

    @Override
    public boolean hasPrev() {
        return false;
    }

    @Override
    public Squirrel prev() {
        return null;
    }
}

/**
 * TODO: Implement the rest of this double link structure.
 */
class SquirrelDoubleLink extends SquirrelLink {
    public SquirrelDoubleLink(Squirrel squirrel, SquirrelLink next) {
        super(squirrel, next);
    }
}

/**
 * TODO: Implement the rest of this class.
 */
public class SquirrelDoublyLinkedList extends SquirrelList {
    SquirrelDoublyLinkedList() {
        super();
    }

    @Override
    public SquirrelList addToFront(Squirrel squirrel) {
        return this;
    }

    @Override
    public Squirrel getItem(int m) {
        return null;
    }

    public Squirrel getFirst() {
        return null;
    }

    @Override
    public BackIterator<Squirrel> iterator() {
        return new SquirrelDoublyLinkedListIterator(mFirst);
    }

}
