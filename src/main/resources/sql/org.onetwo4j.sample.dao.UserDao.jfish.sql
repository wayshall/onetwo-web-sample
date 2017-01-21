/*****
 * @name: batchInsert
 * 批量插入     */
    insert 
    into
        web_user
        (birthday, email, gender, mobile, nick_name, password, user_name) 
    values
        (:birthday, :email, :gender, :mobile, :nickName, :password, :userName)