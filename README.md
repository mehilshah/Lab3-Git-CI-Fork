# Lab 3: Git + CI

## Overview

This lab focuses on practicing Git workflow and understanding Continuous Integration (CI) principles. You will learn how to create branches, make changes, commit code, and merge changes using Git commands and GitHub's interface.

## Git
### Scenario 1: Regular Git Workflow

1. Create a new branch and switch to it:
   ``git checkout -b <branch-name>``

2. Make the necessary changes for the assigned functionality.

3. Stage the changes for commit:
   ``git add .``

4. Commit the code with a descriptive message:
   ``git commit -m "Your commit message here"``

5. Push the changes to the remote repository:
   ``git push``

6. Open the GitHub website and create a new Pull Request (PR) from your branch to the main branch.

7. Request code review from your team members.

8. Once the code is reviewed and approved, merge the changes into the main branch.

## Scenario 2: Resolving Merge Conflicts in a Pull Request

1. Switch to the branch with merge conflicts: ``git checkout <branch-name>``

2. Pull the changes from main: ``git pull origin main``

3. Identify the files with conflicts. Git will mark these in the affected files.

4. Open each conflicting file and look for conflict markers: ```<<<<<<< HEAD```

5. Manually resolve the conflicts by editing the files. Decide which changes to keep or how to combine them.

6. Remove the conflict markers after resolving each conflict.

7. After resolving all conflicts, stage the modified files: ``git add <resolved-file1> <resolved-file2>``, or stage all resolved files: ``git add .``

8. Commit the resolved changes: ``git commit -m "Resolve merge conflicts with main branch"``

9. Push the updated branch to the remote repository: ``git push origin <branch-name>``

### Best Practices

- Use descriptive branch names related to the feature or bug fix you're working on.
- Write clear and concise commit messages.
- Keep your commits small and focused on a single change or feature.
- Regularly pull changes from the main branch to keep your feature branch up-to-date.
- Address all comments and suggestions from code reviews before merging.

### Additional Resources for Git

- [Git Documentation](https://git-scm.com/doc)
- [GitHub Pull Request Guide](https://docs.github.com/en/github/collaborating-with-issues-and-pull-requests/about-pull-requests)
- [Resolving Merge Conflicts](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/addressing-merge-conflicts/resolving-a-merge-conflict-using-the-command-line)