# cellular-automata

Generates 1D Cellular Automaton output using Clojure.

See http://mathworld.wolfram.com/ElementaryCellularAutomaton.html for more information on cellular automata. 

## Installation

Download from https://github.com/StephenRudolph/cellular-automata.

## Usage

Run to print out the 1D cellular automata given initial conditions. 

    $ java -jar cellular-automata-0.1.0-standalone.jar [rule #] [# of generations]

## Options

Rule Number: Specify which automaton rule to use (0-255 produce unique results)

Generation Count: Number of generations of output to print

## Known Limitations
Rule 0 currently results in an exception.

Odd numbered rules are not properly handled.

## Examples

    $ java -jar cellular-automata-0.1.0-standalone.jar 126 15

    ◻◻◻◻◻◻◻◻◻◻◻◻◻◻◻◼◻◻◻◻◻◻◻◻◻◻◻◻◻◻◻
    ◻◻◻◻◻◻◻◻◻◻◻◻◻◻◼◼◼◻◻◻◻◻◻◻◻◻◻◻◻◻◻
    ◻◻◻◻◻◻◻◻◻◻◻◻◻◼◼◻◼◼◻◻◻◻◻◻◻◻◻◻◻◻◻
    ◻◻◻◻◻◻◻◻◻◻◻◻◼◼◼◼◼◼◼◻◻◻◻◻◻◻◻◻◻◻◻
    ◻◻◻◻◻◻◻◻◻◻◻◼◼◻◻◻◻◻◼◼◻◻◻◻◻◻◻◻◻◻◻
    ◻◻◻◻◻◻◻◻◻◻◼◼◼◼◻◻◻◼◼◼◼◻◻◻◻◻◻◻◻◻◻
    ◻◻◻◻◻◻◻◻◻◼◼◻◻◼◼◻◼◼◻◻◼◼◻◻◻◻◻◻◻◻◻
    ◻◻◻◻◻◻◻◻◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◻◻◻◻◻◻◻◻
    ◻◻◻◻◻◻◻◼◼◻◻◻◻◻◻◻◻◻◻◻◻◻◼◼◻◻◻◻◻◻◻
    ◻◻◻◻◻◻◼◼◼◼◻◻◻◻◻◻◻◻◻◻◻◼◼◼◼◻◻◻◻◻◻
    ◻◻◻◻◻◼◼◻◻◼◼◻◻◻◻◻◻◻◻◻◼◼◻◻◼◼◻◻◻◻◻
    ◻◻◻◻◼◼◼◼◼◼◼◼◻◻◻◻◻◻◻◼◼◼◼◼◼◼◼◻◻◻◻
    ◻◻◻◼◼◻◻◻◻◻◻◼◼◻◻◻◻◻◼◼◻◻◻◻◻◻◼◼◻◻◻
    ◻◻◼◼◼◼◻◻◻◻◼◼◼◼◻◻◻◼◼◼◼◻◻◻◻◼◼◼◼◻◻
    ◻◼◼◻◻◼◼◻◻◼◼◻◻◼◼◻◼◼◻◻◼◼◻◻◼◼◻◻◼◼◻
    ◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼

## License

Copyright © 2015 Stephen Rudolph

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
