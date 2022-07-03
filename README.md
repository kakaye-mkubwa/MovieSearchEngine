# DBSearchEngine
### Introduction
DBSearch Engine is a java-based simple search engine to search for movies 
based on instances of keywords in movies descriptions. The titles and 
descriptions of the movies are stored in separate-chaining hash tables.

### Project Structure

    |-- out
    |   `-- production
    |       `-- RUMDbSearchEngine
    |           |-- Driver.class
    |           |-- Location.class
    |           |-- MovieSearchResult.class
    |           |-- RUMDbSearchEngine.class
    |           |-- StdIn.class
    |           |-- StdOut.class
    |           `-- WordOccurrence.class
    |-- src
    |   |-- Driver.java
    |   |-- Location.java
    |   |-- MovieSearchResult.java
    |   |-- RUMDbSearchEngine.java
    |   |-- StdIn.java
    |   |-- StdOut.java
    |   `-- WordOccurrence.java
    |-- dataSample.txt
    |-- data.txt
    |-- noisewords.txt
    |-- README.md
    `-- RUMDbSearchEngine.iml
    
    4 directories, 19 files


##### Input Files
1. **data.txt** - txt file with test data
2. **dataSample.txt** - txt file containing a subset of the test data
3. **noisewords.txt** - txt file containing some of the words regarded as noise words


### Development Setup
Download or clone this project from github.
In case you are intelliJ Idea IDE, just copy/clone this project folder into your 
projects directory, then proceed to run the Driver.java class in the src folder

Alternatively, you can run this program from the terminal, by:
1. Copy the `input files`, as mentioned above, into the `src` folder.
2. Compile the java files and run them as shown below. 
(Below implementation assumes your working directory is project folder)

            cp *.txt src/
            cd src
            javac *.java
            java Driver
            
#### Programming Languages Used
1. **Java**