package bitcamp.util;

public class NcpConfig {
	// 프로퍼티 파일에서 선언된 값 중에서
	// ncp.* 이름으로 된 프로퍼티 값을 받을 필드를 선언한다.
	private String endPoint = "http://kr.object.ncloudstorage.com"; // ncp.endPoint 프로퍼티를 받는 필드
	private String regionName = "kr-standard"; // ncp.regionName 프로퍼티를 받는 필드
	private String accessKey = System.getProperty("accessKey");
	private String secretKey = System.getProperty("secretKey");
	
	public String getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public String getAccessKey() {
		return accessKey;
	}
	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}
	public String getSecretKey() {
		return secretKey;
	}
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

}
