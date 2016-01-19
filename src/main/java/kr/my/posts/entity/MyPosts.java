package kr.my.posts.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by goodjwon on 16. 1. 16..
 */
@Entity
@javax.persistence.Table(name = "MY_POSTS", schema = "", catalog = "MY_POSTS")
public class MyPosts {
    private Long postSeq;

    @Id
    @javax.persistence.Column(name = "POST_SEQ", nullable = false, insertable = true, updatable = true)
    public Long getPostSeq() {
        return postSeq;
    }

    public void setPostSeq(Long postSeq) {
        this.postSeq = postSeq;
    }

    private String myUsersMemCode;

    @Basic
    @javax.persistence.Column(name = "MY_USERS_MEM_CODE", nullable = false, insertable = true, updatable = true, length = 15)
    public String getMyUsersMemCode() {
        return myUsersMemCode;
    }

    public void setMyUsersMemCode(String myUsersMemCode) {
        this.myUsersMemCode = myUsersMemCode;
    }

    private String memName;

    @Basic
    @javax.persistence.Column(name = "MEM_NAME", nullable = false, insertable = true, updatable = true, length = 45)
    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    private String memNickName;

    @Basic
    @javax.persistence.Column(name = "MEM_NICK_NAME", nullable = false, insertable = true, updatable = true, length = 45)
    public String getMemNickName() {
        return memNickName;
    }

    public void setMemNickName(String memNickName) {
        this.memNickName = memNickName;
    }

    private Timestamp postDate;

    @Basic
    @javax.persistence.Column(name = "POST_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getPostDate() {
        return postDate;
    }

    public void setPostDate(Timestamp postDate) {
        this.postDate = postDate;
    }

    private String postContents;

    @Basic
    @javax.persistence.Column(name = "POST_CONTENTS", nullable = false, insertable = true, updatable = true, length = 2147483647)
    public String getPostContents() {
        return postContents;
    }

    public void setPostContents(String postContents) {
        this.postContents = postContents;
    }

    private String postTitle;

    @Basic
    @javax.persistence.Column(name = "POST_TITLE", nullable = false, insertable = true, updatable = true, length = 1000)
    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    private String postExcerpt;

    @Basic
    @javax.persistence.Column(name = "POST_EXCERPT", nullable = false, insertable = true, updatable = true, length = 45)
    public String getPostExcerpt() {
        return postExcerpt;
    }

    public void setPostExcerpt(String postExcerpt) {
        this.postExcerpt = postExcerpt;
    }

    private String postStatus;

    @Basic
    @javax.persistence.Column(name = "POST_STATUS", nullable = false, insertable = true, updatable = true, length = 3)
    public String getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(String postStatus) {
        this.postStatus = postStatus;
    }

    private String postPassword;

    @Basic
    @javax.persistence.Column(name = "POST_PASSWORD", nullable = false, insertable = true, updatable = true, length = 45)
    public String getPostPassword() {
        return postPassword;
    }

    public void setPostPassword(String postPassword) {
        this.postPassword = postPassword;
    }

    private Timestamp postModified;

    @Basic
    @javax.persistence.Column(name = "POST_MODIFIED", nullable = false, insertable = true, updatable = true)
    public Timestamp getPostModified() {
        return postModified;
    }

    public void setPostModified(Timestamp postModified) {
        this.postModified = postModified;
    }

    private Long postParent;

    @Basic
    @javax.persistence.Column(name = "POST_PARENT", nullable = false, insertable = true, updatable = true)
    public Long getPostParent() {
        return postParent;
    }

    public void setPostParent(Long postParent) {
        this.postParent = postParent;
    }

    private String postType;

    @Basic
    @javax.persistence.Column(name = "POST_TYPE", nullable = false, insertable = true, updatable = true, length = 3)
    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    private String postMineType;

    @Basic
    @javax.persistence.Column(name = "POST_MINE_TYPE", nullable = false, insertable = true, updatable = true, length = 100)
    public String getPostMineType() {
        return postMineType;
    }

    public void setPostMineType(String postMineType) {
        this.postMineType = postMineType;
    }

    private String commentStatus;

    @Basic
    @javax.persistence.Column(name = "COMMENT_STATUS", nullable = false, insertable = true, updatable = true, length = 45)
    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    private String commontCnt;

    @Basic
    @javax.persistence.Column(name = "COMMONT_CNT", nullable = false, insertable = true, updatable = true, length = 45)
    public String getCommontCnt() {
        return commontCnt;
    }

    public void setCommontCnt(String commontCnt) {
        this.commontCnt = commontCnt;
    }

    private String postRole;

    @Basic
    @javax.persistence.Column(name = "POST_ROLE", nullable = true, insertable = true, updatable = true, length = 45)
    public String getPostRole() {
        return postRole;
    }

    public void setPostRole(String postRole) {
        this.postRole = postRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyPosts myPosts = (MyPosts) o;

        if (postSeq != null ? !postSeq.equals(myPosts.postSeq) : myPosts.postSeq != null) return false;
        if (myUsersMemCode != null ? !myUsersMemCode.equals(myPosts.myUsersMemCode) : myPosts.myUsersMemCode != null)
            return false;
        if (memName != null ? !memName.equals(myPosts.memName) : myPosts.memName != null) return false;
        if (memNickName != null ? !memNickName.equals(myPosts.memNickName) : myPosts.memNickName != null) return false;
        if (postDate != null ? !postDate.equals(myPosts.postDate) : myPosts.postDate != null) return false;
        if (postContents != null ? !postContents.equals(myPosts.postContents) : myPosts.postContents != null)
            return false;
        if (postTitle != null ? !postTitle.equals(myPosts.postTitle) : myPosts.postTitle != null) return false;
        if (postExcerpt != null ? !postExcerpt.equals(myPosts.postExcerpt) : myPosts.postExcerpt != null) return false;
        if (postStatus != null ? !postStatus.equals(myPosts.postStatus) : myPosts.postStatus != null) return false;
        if (postPassword != null ? !postPassword.equals(myPosts.postPassword) : myPosts.postPassword != null)
            return false;
        if (postModified != null ? !postModified.equals(myPosts.postModified) : myPosts.postModified != null)
            return false;
        if (postParent != null ? !postParent.equals(myPosts.postParent) : myPosts.postParent != null) return false;
        if (postType != null ? !postType.equals(myPosts.postType) : myPosts.postType != null) return false;
        if (postMineType != null ? !postMineType.equals(myPosts.postMineType) : myPosts.postMineType != null)
            return false;
        if (commentStatus != null ? !commentStatus.equals(myPosts.commentStatus) : myPosts.commentStatus != null)
            return false;
        if (commontCnt != null ? !commontCnt.equals(myPosts.commontCnt) : myPosts.commontCnt != null) return false;
        return postRole != null ? postRole.equals(myPosts.postRole) : myPosts.postRole == null;

    }

    @Override
    public int hashCode() {
        int result = postSeq != null ? postSeq.hashCode() : 0;
        result = 31 * result + (myUsersMemCode != null ? myUsersMemCode.hashCode() : 0);
        result = 31 * result + (memName != null ? memName.hashCode() : 0);
        result = 31 * result + (memNickName != null ? memNickName.hashCode() : 0);
        result = 31 * result + (postDate != null ? postDate.hashCode() : 0);
        result = 31 * result + (postContents != null ? postContents.hashCode() : 0);
        result = 31 * result + (postTitle != null ? postTitle.hashCode() : 0);
        result = 31 * result + (postExcerpt != null ? postExcerpt.hashCode() : 0);
        result = 31 * result + (postStatus != null ? postStatus.hashCode() : 0);
        result = 31 * result + (postPassword != null ? postPassword.hashCode() : 0);
        result = 31 * result + (postModified != null ? postModified.hashCode() : 0);
        result = 31 * result + (postParent != null ? postParent.hashCode() : 0);
        result = 31 * result + (postType != null ? postType.hashCode() : 0);
        result = 31 * result + (postMineType != null ? postMineType.hashCode() : 0);
        result = 31 * result + (commentStatus != null ? commentStatus.hashCode() : 0);
        result = 31 * result + (commontCnt != null ? commontCnt.hashCode() : 0);
        result = 31 * result + (postRole != null ? postRole.hashCode() : 0);
        return result;
    }
}
