Configure Git
    git config --global user.name
    git config --global user.email
Initialize Git
    git init 
check status
    git status
    Git Commit without Stage
        git status --short
            ?? - Tệp không theo dõi
            A - Các tệp được thêm vào vùng hiển thị
            M - Các tệp đã sửa đổi
            D - Các tệp đã xóa
Git Staging Environment
    git add|git add --all|git add -A|git add .
Git Commit
    git commit -m "message"
    Not Git Staging Environment
        git commit -a -m "message"
Git Commit Log
    git log
Git Help
    git [command] -help         Xem tất cả các tùy chọn có sẵn cho lệnh cụ thể
    git help --all              Xem tất cả các lệnh có thể [ấn q để thoát]
Create branch
    git branch [name-branch]
Show branch
    git branch| git branch -a
    git branch -r
Move [master -> name-branch]
    git checkout [name-branch]
Emergency Branch
    Bây giờ hãy tưởng tượng rằng chúng ta vẫn chưa hoàn thành với [name-branch], nhưng chúng ta cần sửa một lỗi trên master.
    Tôi không muốn trực tiếp gây rối với master và cũng không muốn gây rối với [name-branch], vì nó vẫn chưa được thực hiện.
        git checkout -b [name-branch]
Git Branch Merge
    Merge Branches
        Chúng tôi đã sẵn sàng bản sửa lỗi khẩn cấp và vì vậy hãy hợp nhất nhánh chính và nhánh khắc phục sự cố khẩn cấp.
        Đầu tiên, chúng ta cần thay đổi thành nhánh chính:
            git merge [name-branch]
        Drop branch
            git branch -d [name-branch]
---------------------------------------------------------------------------------------------
Remove Local Repository Git 
    git remote remove origin
Remove list     
    git remote -v
Push Local Repository to GitHub
    git remote add origin URL
        Chúng tôi thấy rằng nó origin được thiết lập thành w3schools-test kho lưu trữ " " ban đầu , chúng tôi cũng muốn thêm kho lưu trữ của riêng mình fork.
        Đầu tiên, chúng tôi rename là bản gốc origin remote:
            git remote rename origin [upstream]
            Lưu ý: Theo quy ước đặt tên Git, bạn nên đặt tên cho kho lưu trữ của riêng mình origin và đặt tên cho kho lưu trữ mà bạn đã phân nhánh upstream
            Bây giờ chúng tôi có 2 điều khiển từ xa:
                origin- của riêng chúng tôi fork, nơi chúng tôi có quyền đọc và ghi
                upstream - bản gốc, nơi chúng tôi có quyền truy cập chỉ đọc
    Bây giờ chúng ta sẽ đẩy nhánh chính của mình đến url gốc và đặt nó làm nhánh từ xa mặc định:
        git push --set-upstream origin master
Pulling to Keep up-to-date with Changes
    Khi làm việc nhóm trong một dự án, điều quan trọng là mọi người phải cập nhật.
    Bất cứ khi nào bạn bắt đầu làm việc trên một dự án, bạn sẽ nhận được những thay đổi gần đây nhất cho bản sao cục bộ của mình.   
    Với Git, bạn có thể làm điều đó với pull.
        pull là sự kết hợp của 2 lệnh khác nhau:
            fetch
            merge
    Git Fetch
        fetch nhận tất cả lịch sử thay đổi của một chi nhánh / đại diện được theo dõi.
        Vì vậy, trên Git cục bộ của bạn và fetch cập nhật để xem những gì đã thay đổi trên GitHub:
            git fetch origin
    Chúng tôi đứng sau origin/master 1 commit. Đó phải là bản cập nhật README.md, nhưng hãy kiểm tra kỹ bằng cách xem log:
        git log origin/master
    Điều đó trông như mong đợi, nhưng chúng tôi cũng có thể xác minh bằng cách hiển thị sự khác biệt giữa địa phương của chúng tôi master và origin/master:
        git diff origin/master
Git Merge
    merge kết hợp nhánh hiện tại với một nhánh được chỉ định.
    Chúng tôi đã xác nhận rằng các bản cập nhật đúng như mong đợi và chúng tôi có thể hợp nhất chi nhánh hiện tại của mình (master) với origin/master:
        git merge origin/master
Git Pull
    Nhưng điều gì sẽ xảy ra nếu bạn chỉ muốn cập nhật kho lưu trữ cục bộ của mình mà không thực hiện tất cả các bước đó?
    pull là sự kết hợp của fetch và merge. Nó được sử dụng để kéo tất cả các thay đổi từ kho lưu trữ từ xa vào nhánh bạn đang làm việc.
    Thực hiện một thay đổi khác đối với tệp Readme.md trên GitHub.
        git pull origin
Git Push to GitHub
    Push Changes to GitHub
        Hãy thử thực hiện một số thay đổi đối với Git địa phương của chúng tôi và đẩy họ đến GitHub.
            git push origin
            git push origin [name-branch]
Git Pull Branch from GitHub
    Pulling a Branch from GitHub
        Hãy pull từ kho lưu trữ GitHub của chúng tôi một lần nữa để mã của chúng tôi được cập nhật: git pull
Push Local Repository to GitHub Pages
    Chúng tôi thêm kho lưu trữ mới này làm điều khiển từ xa cho kho lưu trữ cục bộ của chúng tôi, chúng tôi gọi nó là gh-page(cho Trang GitHub).
        git remote add gh-page URL
    Đảm bảo rằng bạn đang sử dụng master branch, sau đó master branch chuyển sang cái mới remote:
        git push gh-page master
Git Clone from GitHub
    Clone a Fork from GitHub
        git clone URL 
        git clone URL [name-folder]
 