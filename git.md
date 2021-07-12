git init 
	Tác dụng : Khởi tạo 1 git repository 1 project mới hoặc đã có.
git status
	Tác dụng: Để check trạng thái của những file bạn đã thay đổi trong thư mục làm việc
git add [name_file] | git add .
	Tác dụng: Thêm thay đổi đến stage/index trong thư mục làm việc.
git commit -m 'message'
	Tác dụng: commit nghĩa là một action để Git lưu lại một snapshot của các sự thay đổi trong thư mục làm việc.
git log
	Tác dụng: xem lại thông tin lịch sự commit
git show id
	Tác dụng: xem những files thay đổi tại một commit bất kỳ
git diff [Q out]
	Tác dụng: hiện thị thông tin thay đổi giữa thư mục làm việc và vùng index (staging) hoặc với commit cũ.
git restore
	Tác dụng: Lệnh git restore để phục hồi các file của thư mục làm việc.
git checkout
	Tác dụng: Chuyển nhánh và phục hồi file	từ phiên bản cũ
		git checkout -- [name_file]
	git checkout -b [name_branch]:Khởi tạo branch mới
	git checkout [name_bracnh] : Trở về branch muốn làm việc
git restore --staged [name_file]|git reset [name_file]
	Tác dụng: hủy thao tác sau khi git add
git branch
	Tác dụng: Xem các branch
	git branch -D [name_branch]: Xóa branch
git merge [name_branch] 
	Tác dụng:  dùng để hợp nhất các chi nhánh độc lập thành một nhánh duy nhất trong Git.
git reset --soft id
	Tác dụng: trở lại bước trước khi git commit id
git reset --mixed id
	Tác dụng: trở lại bước trước khi git add
git reset --hard id
	Tác dụng: destroy the file
git revert id
	Tác dụng: Câu lệnh git revert(hoàn lại, hồi lại các tác vụ đã làm) .
npm init
	Tác dụng: Lưu thông tin project
npm install chalk --save
	npm init
		git add package.json
			npm install chalk --save
				Tác dụng: Tạo màu sắc cho terminal
.gitignore
	Create .gitignore
		Viết những file|folder ko muốn cho hiện ở git
git remote add origin URL
	git remote add origin URL
		git remote -v 
			Tác dung:  Get github push|pull
	Push
		git push -u origin master 	//First
		git push					//
	pull
		git clone URL
		git pull

git clone URL
	Tác dụng: Lệnh git clone để sao chép, copy một Git Repo (kho chứa dự án Git) về máy đang local

pull request

	-------------------------------------------------------------
	| 1. git checkout -b [name_branch]: Khởi tạo branch mới	A	|
	-------------------------------------------------------------
	| 2. git push origin [name_branch]: push to branch		A	|
	-------------------------------------------------------------
	| 3. Compare a pull request on Github to master 		A	|
	-------------------------------------------------------------
	| 4. review code: Đánh giá mã.							B	|
	|	4.1 review code online (GitHub)						B	|
	|	4.2 fetch branch into local to test offline (optianl)	|
	|		git fetch origin [name_branch]: download from A B   |          
	|	4.3 approve the pull request						B	|
	-------------------------------------------------------------
	| 5. merge to master: hợp nhất 							A	|
	-------------------------------------------------------------		











										-------------------------------------
										|working directory: Thư mục làm việc|
										-------------------------------------
										|staging area: khu vực dàn dựng		|
										-------------------------------------
										|git repository: khu lưu trữ git	|
										-------------------------------------

								-----------------------------------------------------------------
								|Gitignore là file có tên là . gitignore do Git quy định. 		|
								|Nhiệm vụ của nó là liệt kê những file mà mình không mong muốn 	|
								|cho vào git hoặc hiểu nôm na là Git sẽ bỏ qua những file đó đi.|
								-----------------------------------------------------------------


								----------------------------------------------------------------
								|git config --global credentianl.helper "cache --timeout=18000"|
								----------------------------------------------------------------