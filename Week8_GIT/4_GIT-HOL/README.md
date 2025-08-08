Git Conflict Resolution Hands-on Lab
This hands-on lab focuses on resolving conflicts that occur during a merge. The estimated time to complete this lab is 30 minutes.

Objectives
Explain how to resolve conflicts during a merge.
Implement conflict resolution when multiple users modify the same file, resulting in a conflict with the branch's modifications.
Lab Steps:-
1.Verify State: Ensure the master branch is in a clean state.
2.Create and Modify Branch: Create a branch named "GitWork" and add a file named hello.xml to it. Update the content of 
3.hello.xml and commit the changes to the branch.
4.Switch to Master: Switch back to the master branch.
5.Create Conflict: Add the same hello.xml file to the master branch with different content and commit the changes.
6.Observe Differences: View the log history using git log and observe the differences between the two branches using git diff and the P4Merge tool.
7.Merge and Resolve: Merge the branch into master, which will cause a conflict. Use a 3-way merge tool to resolve the conflict.
8.Commit and Clean Up: Commit the resolved changes to master. Observe the git status and add any backup files to the .gitignore file, then commit the .gitignore file.
9.Delete Branch: Delete the branch that was merged into master. Observe the log to confirm the branch is gone.









