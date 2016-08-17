mkdir 创建一个文件

git init

git config [--global] user.email ""
git config [--global] user.name ""

vim file.name 编辑一个文件

git add file.name

git commit -m "提交说明"

git status 查看工作区文件们的状态

git diff file.name 查看文件远程和本地的区别

git log 日志

git log --pretty=oneline  漂亮点的书写

git reset --hard HEAD^
git reset --hard HEAD^^
git reset --hard HEAD~100
git reset --hard 23974239(版本号)

git reflog 查看每一个记录的回顾 按 q 推出

git checkout -- readme.txt  让这个文件回到最近一次git commit或git add时的状态

git reset HEAD test.sh  撤销全部暂存区的修改

rm file.name 当删除一个文件时 版本库也要删除

git rm file.name

git commit -m "remove file.name"

在本地误删了可以 用 git checkout -- readme.txt 恢复
版本库也误删了 只能退回上一个节点

git remote add origin git@github.com:JillAmethyst/learngit.git

git push -u origin master

在一台电脑上用两个Github账户
1:ssh-keygen -t rsa -C "youremail@example.com"
2:生成时可以把id_rsa 写成 jill_rsa
3:修改config文件
4:ssh-add 
可以参照document中的文档设置

ok 现在在本地的版本库做了提交commit后 运行
git push origin master 就可以把版本库传到远程了 不用加-u















