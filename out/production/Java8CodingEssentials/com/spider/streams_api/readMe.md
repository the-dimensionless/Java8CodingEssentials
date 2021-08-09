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
   
4. Find First (Deterministic) vs Find Any (Non - deterministic)

####Collectors.toList() #Behind the Scenes
.collect(Collectors.toList())

or conversely

'''
collect(
    ArrayList::new, ArrayList::add, ArrayList::addAll
)
'''
Parallel Processing and helpful in combining threads

Concrete Type = Stream -> Initial -> Intermediate Operations -> Terminal Operations

#### Streams are lazy
#### Highly Optimized
#### Very Powerful