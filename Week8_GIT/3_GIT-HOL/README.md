# Git Lab Project

This project is part of a hands-on lab exercise to practice basic Git operations including branching, merging, and using Git tools such as `git diff`, `git log`, and optional merge tools like P4Merge.

##  Objectives

- Create a new branch and make changes.
- Merge changes back into the main branch.
- Learn Git commands via command line.
- Practice using Git workflow similar to real-world development.

##  Technologies

- Git
- Git Bash (CLI)
- Optional: P4Merge or any diff/merge tool

## Steps Performed

1. Initialized Git repository.
2. Created a new branch: `GitNewBranch`.
3. Added and committed a file `myfile.txt` in the branch.
4. Switched to `main` branch.
5. Merged `GitNewBranch` into `main`.
6. Deleted the `GitNewBranch` after merge.

##  Key Git Commands Used

```bash
git init
git checkout -b GitNewBranch
git add myfile.txt
git commit -m "Add myfile.txt to GitNewBranch"
git checkout main
git merge GitNewBranch
git branch -d GitNewBranch
git log --oneline --graph --decorate
