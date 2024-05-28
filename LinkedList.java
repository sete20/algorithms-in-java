// Represents a singly linked list.
public class LinkedList {
    // The first link in the list.
    Link first;

    // Constructs an empty LinkedList.
    public LinkedList() {
        first = null;
    }

    // Inserts a new link with the given item at the beginning of the list.
    public void insert(int i) {
        Link link = new Link(i); // Create a new link with the given item.
        link.next = first; // Set the new link's next to the current first link.
        first = link; // Update the first link to be the new link.
    }

    /**
     * Inserts a new link with the given data after the link containing the
     * specified key.
     * 
     * @param key The data to search for in the list.
     * @param d   The data to be inserted into the new link.
     * @return true if the insertion is successful, false otherwise.
     */
    public boolean insertAfter(int key, int d) {
        // Find the link containing the specified key.
        Link oldLink = find(key);

        // If the link with the key is found.
        if (oldLink != null) {
            // Create a new link with the given data.
            Link newLink = new Link(d);
            // Set the next reference of the new link to the next reference of the link with
            // the key.
            newLink.next = oldLink.next;
            // Set the next reference of the link with the key to the new link.
            oldLink.next = newLink;
            return true; // Return true to indicate successful insertion.
        }
        return false; // Return false if the key is not found in the list.
    }

    // Finds the link with the given item in the list.
    public Link find(int i) {
        Link current = first; // Start at the beginning of the list.
        while (current != null) { // Traverse the list until the end is reached.
            if (current.item == i) { // Check if the current link's item matches the given item.
                return current; // If found, return the current link.
            }
            current = current.next; // Move to the next link.
        }
        return null; // If not found, return null.
    }

    // Deletes the link with the given item from the list.
    public Link delete(int i) {
        Link current = first; // Start at the beginning of the list.
        Link previous = null; // Maintain a reference to the previous link.

        while (current != null) { // Traverse the list until the end is reached.
            if (current.item == i) { // Check if the current link's item matches the given item.
                if (current == first) {
                    first = first.next; // If it's the first link, update the first link.
                } else {
                    previous.next = current.next; // Otherwise, bypass the current link.
                }
                return current; // Return the deleted link.
            }
            previous = current; // Update previous to the current link.
            current = current.next; // Move to the next link.
        }
        return null; // If not found, return null.
    }

    // Displays all the links in the list.
    public void display() {
        Link current = first; // Start at the beginning of the list.
        while (current != null) { // Traverse the list until the end is reached.
            current.display(); // Display the current link.
            current = current.next; // Move to the next link.
        }
    }
}
