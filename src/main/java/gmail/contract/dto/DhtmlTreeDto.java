package gmail.contract.dto;

import gmail.contract.util.StringUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hieunc on 03/03/2016.
 *
 * @Description:
 */
public class DhtmlTreeDto {

	private String id;
	private String text;
	private long child;
	private int open;

	private String im0 = "";
	private String im1 = "";
	private String im2 = "";

	private final List<DhtmlTreeDto> item = new ArrayList<DhtmlTreeDto>();
	private final List<DhtmlTreeNode> userdata = new ArrayList<DhtmlTreeNode>();

	public DhtmlTreeDto() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public long getChild() {
		return child;
	}

	public void setChild(long child) {
		this.child = child;
	}

	public int getOpen() {
		return open;
	}

	public void setOpen(int open) {
		this.open = open;
	}

	public List<DhtmlTreeDto> getItem() {
		return item;
	}

	public void setItem(List<DhtmlTreeDto> item) {
		this.item.clear();
		this.item.addAll(item);
	}

	public List<DhtmlTreeNode> getUserdata() {
		return userdata;
	}

	public void setUserdata(List<DhtmlTreeNode> userdata) {
		this.userdata.clear();
		this.userdata.addAll(userdata);
	}

	public DhtmlTreeNode appendUserData(DhtmlTreeNode node) {
		getUserdata().add(node);
		return node;
	}

	public DhtmlTreeNode appendUserData(String name, String content) {
		final DhtmlTreeNode n = new DhtmlTreeNode();
		n.setName(name);
		n.setContent(content);
		getUserdata().add(n);
		return n;
	}

	public String getIm0() {
		return (StringUtil.isEmpty(im0)) ? null : im0;
	}

	public void setIm0(String im0) {
		this.im0 = im0;
	}

	public String getIm1() {
		return (StringUtil.isEmpty(im1)) ? null : im1;
	}

	public void setIm1(String im1) {
		this.im1 = im1;
	}

	public String getIm2() {
		return (StringUtil.isEmpty(im2)) ? null : im2;
	}

	public void setIm2(String im2) {
		this.im2 = im2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((userdata == null) ? 0 : userdata.hashCode());
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
		DhtmlTreeDto other = (DhtmlTreeDto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (userdata == null) {
			if (other.userdata != null)
				return false;
		} else if (!userdata.equals(other.userdata))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DhtmlTreeDto [id=" + id + ", text=" + text + ", im0=" + im0 + ", im1=" + im1 + ", im2=" + im2 + ", item=" + item + ", userdata=" + userdata
				+ "]";
	}


}
