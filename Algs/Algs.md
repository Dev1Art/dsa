# Algorithm Design Principles

A structured guide to algorithm design principles, techniques, and applications.

---

## Table of Contents
1. [Algorithm Design Principles](#algorithm-design-principles)
2. [Algorithmic Techniques & Paradigms](#algorithmic-techniques--paradigms)
3. [Data Structures](#data-structures)
4. [Applied Algorithms](#applied-algorithms)
5. [Graph Theory](#graph-theory)
6. [Mathematics & Optimization](#mathematics--optimization)
7. [Machine Learning & AI](#machine-learning--ai)
8. [Core Computer Science Topics](#core-computer-science-topics)
9. [Practical Coding Patterns](#practical-coding-patterns)

---

## Algorithm Design Principles

### 1. Divide and Conquer
- **Definition**: Break the problem into smaller subproblems, solve recursively, and combine results.
- **Examples**: Merge Sort, Quick Sort, Binary Search.

### 2. Dynamic Programming
- **Definition**: Solve subproblems once, store results, and reuse them to avoid redundant work.
- **Examples**: Fibonacci, Knapsack Problem, Longest Common Subsequence.

### 3. Greedy Algorithms
- **Definition**: Make locally optimal choices at each step to find a global optimum.
- **Examples**: Dijkstra's Algorithm, Huffman Coding.

### 4. Backtracking
- **Definition**: Explore all possible solutions and backtrack when constraints are violated.
- **Examples**: N-Queens Problem, Sudoku Solver.

### 5. Branch and Bound
- **Definition**: Systematically explore the solution space using bounds to prune branches.
- **Examples**: Traveling Salesman Problem.

### 6. Randomized Algorithms
- **Definition**: Use randomness to make decisions or improve performance.
- **Examples**: Randomized Quick Sort, Monte Carlo Methods.

### 7. Incremental Algorithms
- **Definition**: Process input incrementally, updating the solution as new data arrives.
- **Examples**: Insertion Sort.

### 8. Transform and Conquer
- **Definition**: Transform the problem into a simpler form, solve it, and map the solution back.
- **Examples**: Strassen's Matrix Multiplication.

### 9. Reduction
- **Definition**: Reduce one problem to another problem with a known solution.
- **Examples**: Reducing Maximum Flow to Minimum Cut.

### 10. Heuristic and Metaheuristic Algorithms
- **Definition**: Use rules of thumb or approximate methods to find good-enough solutions.
- **Examples**: Genetic Algorithms, Simulated Annealing.

### 11. Amortized Analysis
- **Definition**: Analyze the average time per operation over a sequence of operations.
- **Examples**: Dynamic Arrays, Hash Tables.

### 12. Parallel and Distributed Algorithms
- **Definition**: Algorithms designed to run on multiple processors or machines.
- **Examples**: MapReduce, Parallel Merge Sort.

### 13. Approximation Algorithms
- **Definition**: Find near-optimal solutions for NP-hard problems.
- **Examples**: 2-Approximation for Vertex Cover.

---

## Algorithmic Techniques & Paradigms

### 1. Sliding Window
- **Use Case**: Subarray/Substring problems.
- **Examples**: Maximum sum subarray, longest substring without repeats.

### 2. Backtracking
- **Use Case**: Constraint satisfaction problems.
- **Examples**: N-Queens, Sudoku.

### 3. Dynamic Programming
- **Use Case**: Overlapping subproblems.
- **Examples**: Knapsack, Shortest Paths.

### 4. Divide and Conquer
- **Use Case**: Large-scale problems.
- **Examples**: Merge Sort, Fast Fourier Transform (FFT).

### 5. Greedy Algorithms
- **Use Case**: Optimization problems with optimal substructure.
- **Examples**: Huffman Coding, Interval Scheduling.

### 6. Two Pointers
- **Use Case**: Array/String traversal.
- **Examples**: Pair sum, palindrome checks.

## For optimization problems

- Greedy, Dynamic, B&B
---

## Applied Algorithms

### Cryptography
- **Ciphers**: AES, RSA, RC4.
- **Hashing**: SHA-256, bcrypt.
- **Key Exchange**: Diffie-Hellman, ECC.

### Signal Processing
- **Audio Filters**: Low-pass, High-pass, Fourier Transform.
- **Compression**: LZ77, Huffman Coding.

### Geometry
- **Convex Hull**: Graham Scan, Jarvis March.
- **Collision Detection**: SAT (Separating Axis Theorem).

### Scheduling
- **Job Scheduling**: Round Robin, Shortest Job First (SJF).
- **Resource Allocation**: Banker’s Algorithm.

---

## Graph Theory

### 1. Traversal
- **Examples**: BFS, DFS.

### 2. Shortest Path
- **Examples**: Dijkstra, Bellman-Ford.

### 3. Minimum Spanning Tree
- **Examples**: Prim, Kruskal.

### 4. Network Flow
- **Examples**: Ford-Fulkerson, Edmonds-Karp.

---

## Mathematics & Optimization

### 1. Linear Algebra
- **Examples**: Matrix Multiplication (Strassen’s Algorithm).

### 2. Numerical Methods
- **Examples**: Newton-Raphson, Monte Carlo.

### 3. Game Theory
- **Examples**: Minimax, Nash Equilibrium.

---

## Machine Learning & AI

### 1. Supervised Learning
- **Examples**: Linear Regression, Decision Trees.

### 2. Unsupervised Learning
- **Examples**: K-Means, PCA.

### 3. Reinforcement Learning
- **Examples**: Q-Learning, Deep Q-Networks (DQN).

---

## Core Computer Science Topics

### 1. Operating Systems
- **Examples**: Page Replacement (LRU), File Systems.

### 2. Networking
- **Examples**: Routing Algorithms (OSPF), TCP/IP.

### 3. Databases
- **Examples**: B-Trees, Query Optimization.

---

## Practical Coding Patterns

### 1. Bit Manipulation
- **Examples**: XOR tricks, Bitmask DP.

### 2. Fast & Slow Pointers
- **Examples**: Cycle detection in linked lists.

### 3. Union-Find
- **Examples**: Connected components in graphs.

---

## Comparison of Key Design Principles

| Principle            | Key Idea                                                                 | Strengths                              | Weaknesses                           |
|----------------------|--------------------------------------------------------------------------|----------------------------------------|--------------------------------------|
| **Divide and Conquer** | Break problems into subproblems, solve recursively, and combine.        | Efficient for large-scale problems.    | May require extra space.             |
| **Dynamic Programming** | Store subproblem results to avoid redundant computation.                | Optimal for overlapping subproblems.   | High memory usage.                   |
| **Greedy Algorithms**  | Make locally optimal choices iteratively.                                | Fast and simple.                       | No guarantee of global optimality.   |
| **Backtracking**       | Explore all solutions and backtrack on failure.                         | Exhaustive and precise.                | Exponential time complexity.         |

---

## General Structure of Algorithm Design
1. **Problem Analysis**: Define constraints and goals.
2. **Paradigm Selection**: Choose a design principle (e.g., Divide and Conquer).
3. **Algorithm Design**: Decompose into subproblems and define steps.
4. **Implementation**: Translate to code.
5. **Complexity Analysis**: Evaluate time and space efficiency.
6. **Optimization**: Refine for performance.

---

# Resources and References
**The best sources to learn about algorithms in my opinion.**
- **Books**:
    - ["Introduction to Algorithms" by Cormen, Leiserson, Rivest, and Stein (CLRS).](https://dl.ebooksworld.ir/books/Introduction.to.Algorithms.4th.Leiserson.Stein.Rivest.Cormen.MIT.Press.9780262046305.EBooksWorld.ir.pdf)
- **Online Courses**:
    - [Algorithms Specialization by Stanford (Coursera)](https://www.coursera.org/specializations/algorithms)
    - [MIT OpenCourseWare: Introduction to Algorithms](https://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-006-introduction-to-algorithms-fall-2011/)
- **Web**:
    - [GeeksforGeeks](https://www.geeksforgeeks.org/)
    - [LeetCode](https://leetcode.com/)
- **YT**:
    - [Abdul Bari](https://www.youtube.com/@abdul_bari)
    - [Jenny's Lectures](https://www.youtube.com/@JennyslecturesCSIT)
    - [GeeksforGeeks](https://www.youtube.com/@GeeksforGeeksVideos)