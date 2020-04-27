/**
    * Demonstrates -Xlint:cast warning of a redundant cast.
    */
   private static void demonstrateCastWarning()
   {
      final Set<Person> people = new HashSet<Person>();
      people.add(fred);
      people.add(wilma);
      people.add(barney);
      for (final Person person : people)
      {
         // Redundant cast because generic type explicitly is Person
         out.println("Person: " + ((Person) person).getFullName());
      }
   }
