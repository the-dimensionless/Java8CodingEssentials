### Streams
 An Abstraction to focus on the big picture rather than the small pieces.
 <br>Helps move from Imperative to Functional Programming.
 <br>Mostly used with Collections.
 
### Steps to work:
1. Begin with concrete implementation (Arrays, Sets, Lists, Maps)
2. Call the .stream() on these that returns a Stream. (Streams can be concatenated with other Streams)
3. After pipeline, go back to concrete type. (List, Int, Object, Optional, String)
<br>Some methods that help:
   <br>sum(), collect(Collectors.toList()), average, collect(Collectors.groupingBy())
   