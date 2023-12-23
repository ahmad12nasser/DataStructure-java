public class CDStack {
    CD top;
    public CDStack(){
        top = null;
    }
    public void push(CD cd){
        if (top == null) {
            top = cd;
        } else {
            cd.next = top;
            top = cd;
        }
    }
    public void pop(){
        if (top != null) {
            top = top.next;
        } else {
            System.out.println("Empty stack");
        }
    }
    public CD peek(){
        if (top != null) {
            return top;
        } else {
            return null;
        }
    }
    public CD searchByArtist(String n) {
        if (top != null) {
            CD temp = top;
            while (temp != null) {
                if (temp.ArtistName.equals(n)) {
                    return temp;
                } else {
                    temp = temp.next;
                }
            }
        }
        return null;
    }

    public int FullStackSize() {
        int count = 0;
        int totalSize = 0;
        CD currentCD = top;
        while (currentCD != null) {
            count++;
            totalSize += currentCD.currSize;
            currentCD = currentCD.next;
        }
        System.out.println("Total CDs: " + count);
        System.out.println("Total Size: " + totalSize + " MB");
        return count;
    }
    public void CDCount() {
        int count = 0;
        CD currentCD = top;
        while (currentCD != null) {
            count++;
            currentCD = currentCD.next;
        }
        System.out.println("Total CDs: " + count);
    }

    public void PrintAll() {
        CD currentCD = top;
        while (currentCD != null) {
            System.out.println("CDId: " + currentCD.CDid);
            System.out.println("AlbumName: " + currentCD.AlbumName);
            System.out.println("Year: " + currentCD.year);
            System.out.println("ArtistName: " + currentCD.ArtistName);
            System.out.println("Playlist:");
            for (Song song : currentCD.Playlist) {
                System.out.println("- " + song.name + " (" + song.Size + " MB)");
            }
            System.out.println("--------------");
            currentCD = currentCD.next;
        }
    }
}
