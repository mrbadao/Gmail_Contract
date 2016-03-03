package gmail.contract.dto;

import gmail.contract.util.StringUtil;

/**
 * Created by hieunc on 03/03/2016.
 *
 * @Description:
 */

public class DhtmlTreeNode {
	private String name;
	private String content = "";

	public DhtmlTreeNode() {

	}

	public DhtmlTreeNode(String name, String content) {
		setName(name);
		setContent(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return (StringUtil.isEmpty(content)) ? null : content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DhtmlTreeNode other = (DhtmlTreeNode) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DhtmlTreeNode [name=" + name + ", content=" + content + "]";
	}

}
