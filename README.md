# Los Amigos 🏀
## Description of exercise:
The Mexican basketball team named “Los Amigos” has five athletes that constitute their
starting squad. For each of these AGathletes, their details (name, age and total points scored
during the season) are retained in three parallel arrays.

|   | [0] | [1] | [2] | [3] | [4] |
| - | --- | --- | --- | --- | --- |
| **NAMES** | BOSS | BLOCK | BRAWN | BRAYNT | CLORKSAN |
| **AGE** | 30 | 24 | 23 | 37 | 23 |
| **POINTS** | 473 | 133 | 115 | 1161 | 1225 |

For each of the following questions, write the Java code and upload it within a folder named
“Los Amigos – Your Name” in your Teams Assignments.
1) Find the oldest member in the squad and output his name, age and points.
2) Find the youngest member in the squad and output his name, age and points.
3) Find the point range between the member with the highest and lowest points. Output
the result.
4) Sort the arrays in descending order, and in a parallel manner, according to the age of
the players and output the sorted arrays, in a readable manner.
5) Find the average age of the team and output the result.
6) Find the average points of the team and output the result.
Apart from the starting squad there are five more athletes in the teams that are the reserves.
There exist three different parallel arrays for these athletes.

|   | [0] | [1] | [2] | [3] | [4] |
| - | --- | --- | --- | --- | --- |
| **NAMES_RESERVES** | HEBBIRT | HEURTAS | KYLLE | NENCA | RENDLA |
| **AGE_RESERVES** | 29 | 32 | 25 | 23 | 21 |
| **POINTS_RESERVES** | 481 | 237 | 152 | 349 | 919 |

8) The coach of the team wants to move a player from the reserves to the starting squad
so that the total points scored of the starting squad would increase as much as
possible. Swap the player with the lowest number of points scored in the starting
squad with the player with the highest number of points scored in the reserves.
Output the names of the player of the new starting squad.
9) Find the new average points of the starting squad and output the result.
10) The coach believes in building a younger starting squad and as such wants to replace
all players from the starting squad, that are older than the starting squad’s average
age, with younger players from the reserves. The coach will replace those players from
the starting squad with the best players from the reserve squad that are younger than
the starting squad’s average age. By best the coach means those players that have
scored the most points. Find the players that need to be replaced from the starting
squad, the players that will replace them from the reserves, and swap them.
11) The coach believes in fair play and equality and as such has decided to unite the two
squads (starting and reserves) into one. Create three parallel arrays
(NAMES_UNITED, AGE_UNITED, POINTS_UNITED) and append the data of both
of squads (starting and reserves) to it.
12) Sort the united parallel arrays according to the points scored. Output the sorted
arrays, in a readable manner.
13) After numerous years of playing for the team and guiding “Los Amigos” through
various titles, the player BRAYNT has retired. He will be replaced by a newcomer, his
older son, who has the following details:

| NAME | AGE | POINTS |
| --- | --- | --- |
| BRAYNT_JR | 18 | 0 |

14) BRAYNT was a very active player and he had scored 1161 points. Find the player
with 1161 points, using binary search, remove him, and shift each following
element left, adding the newcomer at the end of the parallel arrays. Output the
arrays in a readable manner.
