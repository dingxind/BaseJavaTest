package com.hp.day14.singleton;

public class Video {
	private String videoName;
	private int time;

	public Video() {

	}

	public Video(String videoName, int time) {
		this.videoName = videoName;
		this.time = time;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("视频名称是");
		sb.append(videoName);
		sb.append("时长是");
		sb.append(time);
		sb.append("分钟的视频");
		return sb.toString();
	}

	public static void main(String[] args) {
		Recycle recycle = Recycle.getRecycleInstance();
		Video video = new Video("生化危机",120);
		recycle.delete(video.toString());
	}

}
