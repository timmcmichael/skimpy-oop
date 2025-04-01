# Restructuring an AsciiDoc Ebook in GitHub

## 1. Create a Backup Branch
Before making any changes, create a backup of your current work:
```sh
git checkout -b backup-original
git push origin backup-original
```
This ensures that your original work is preserved on GitHub in case you need to revert.

## 2. Create a New Empty Branch
If you want to start with a clean slate, create a new branch without any existing files:
```sh
git checkout --orphan restructure-clean
git rm -rf .
```
This removes all tracked files but keeps the Git history intact.

## 3. Create a New Folder Structure
Manually create the new folder and file structure using:
- **VS Code / File Explorer / Terminal** (e.g., `mkdir chapters assets`).
- If you have default template files, create them now.

## 4. Copy Over Only Necessary Files
- Manually copy only the files you need from the `main` branch or `backup-original`.
- If you need a reference, check out your backup branch and copy from there.

## 5. Commit and Push the New Structure
Once you’re satisfied with the new structure:
```sh
git add .
git commit -m "Initial clean structure for ebook"
git push origin restructure-clean
```

## 6. Merge Once Ready
If everything looks good:
```sh
git checkout main
git merge restructure-clean
git push origin main
```
If anything goes wrong, you still have the `backup-original` branch to recover your previous structure.
