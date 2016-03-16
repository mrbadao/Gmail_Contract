package gmail.contract.dto;

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
	private int open;
	private String im1;
	private String im0;
	private String im2;

	private List<DhtmlTreeDto> item = new ArrayList<DhtmlTreeDto>();
	private List<DhtmlTreeNode> userData = new ArrayList<DhtmlTreeNode>();

	public DhtmlTreeDto() {

	}

	public DhtmlTreeDto(String id) {
		this.id = id;
	}

	public DhtmlTreeDto(String id, String text, List<String> imgArrayList) {
		this.id = id;
		this.text = text;
		this.open = 0;

		this.im1 = imgArrayList.get(1);
		this.im2 = imgArrayList.get(2);
		this.im0 = imgArrayList.get(0);
	}

	public DhtmlTreeDto(String id, String text, List<String> imgArrayList, int open) {
		this.id = id;
		this.text = text;
		this.open = open;
		this.im0 = imgArrayList.get(0);
		this.im1 = imgArrayList.get(1);
		this.im2 = imgArrayList.get(2);
	}

	public void putChild(DhtmlTreeDto item) {
		this.item.add(item);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getOpen() {
		return open;
	}

	public void setOpen(int open) {
		this.open = open;
	}

	public String getIm0() {
		return im0;
	}

	public void setIm0(String im0) {
		this.im0 = im0;
	}


	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<DhtmlTreeDto> getItem() {
		return item;
	}

	public void setItem(List<DhtmlTreeDto> item) {
		this.item = item;
	}

	public List<DhtmlTreeNode> getUserData() {
		return userData;
	}

	public void setUserData(List<DhtmlTreeNode> userData) {
		this.userData = userData;
	}

	public String getIm1() {
		return im1;
	}

	public void setIm1(String im1) {
		this.im1 = im1;
	}

	public String getIm2() {
		return im2;
	}

	public void setIm2(String im2) {
		this.im2 = im2;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		DhtmlTreeDto that = (DhtmlTreeDto) o;

		if (open != that.open) return false;
		if (id != null ? !id.equals(that.id) : that.id != null) return false;
		if (text != null ? !text.equals(that.text) : that.text != null) return false;
		if (im0 != null ? !im0.equals(that.im0) : that.im0 != null) return false;
		if (im1 != null ? !im1.equals(that.im1) : that.im1 != null) return false;
		if (im2 != null ? !im2.equals(that.im2) : that.im2 != null) return false;
		if (item != null ? !item.equals(that.item) : that.item != null) return false;
		return !(userData != null ? !userData.equals(that.userData) : that.userData != null);

	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (text != null ? text.hashCode() : 0);
		result = 31 * result + open;
		result = 31 * result + (im0 != null ? im0.hashCode() : 0);
		result = 31 * result + (im1 != null ? im1.hashCode() : 0);
		result = 31 * result + (im2 != null ? im2.hashCode() : 0);
		result = 31 * result + (item != null ? item.hashCode() : 0);
		result = 31 * result + (userData != null ? userData.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "DhtmlTreeDto{" +
				"id='" + id + '\'' +
				", text='" + text + '\'' +
				", open=" + open +
				", im0='" + im0 + '\'' +
				", im1='" + im1 + '\'' +
				", im2='" + im2 + '\'' +
				", item=" + item +
				", userData=" + userData +
				'}';
	}
}
