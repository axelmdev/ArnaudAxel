package entities;

import javajackson.javajackson.json.manager.JsonManager;

public class Configuration {
	
	private String version;
	private String db;
	private String conf_version;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public String getConf_version() {
		return conf_version;
	}

	public void setConf_version(String conf_version) {
		this.conf_version = conf_version;
	}
}
