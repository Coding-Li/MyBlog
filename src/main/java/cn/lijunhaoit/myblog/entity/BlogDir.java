package cn.lijunhaoit.myblog.entity;


/**
 * 日志目录结构
 */
public class BlogDir {

    /**
     * 唯一的iD
     */
    private String uuid;

    /**
     * 目录名称
     */
    private String dirName;

    /**
     * 目录类型
     */
    private String dirType;


    /**
     * 父目录对象
     */
    private BlogDir parentBlogDir;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDirName() {
        return dirName;
    }

    public void setDirName(String dirName) {
        this.dirName = dirName;
    }

    public String getDirType() {
        return dirType;
    }

    public void setDirType(String dirType) {
        this.dirType = dirType;
    }

    public BlogDir getParentBlogDir() {
        return parentBlogDir;
    }

    public void setParentBlogDir(BlogDir parentBlogDir) {
        this.parentBlogDir = parentBlogDir;
    }
}
