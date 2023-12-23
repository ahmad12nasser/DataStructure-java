_**CD Management System**_

          The CD Management System is a simple Java console application that simulates the management of CDs and their playlists. The system includes classes for Song, CD, CDStack, and a Main class to demonstrate the functionality.
  _**Classes**_
SONG
The Song class represents a music track with attributes such as name and Size (file size in MB). It has two constructors, one default and one with parameters to initialize the attributes.

CD
The CD class represents a compact disc with attributes like CDId, AlbumName, year, ArtistName, currSize, next, and a playlist (Playlist). It includes a constructor to initialize the CD attributes and a method Burn to add songs to the CD's playlist.

CDStack
The CDStack class is a stack-based data structure that manages a collection of CDs. It includes methods like push, pop, peek, searchByArtist, FullStackSize, CDCount, and PrintAll to perform operations on the stack and retrieve information about CDs.

Main
The Main class serves as the entry point of the application. It demonstrates the functionality of the CD Management System by creating CDs, adding songs to them, pushing them onto the stack, and performing various operations like searching for CDs by artist name and printing the entire CD collection.
