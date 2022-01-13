package alfa;

import PamModel.PamDependency;
import PamModel.PamPluginInterface;

public class ALFAPlugin implements PamPluginInterface {

	private String jarFile;

	@Override
	public String getDefaultName() {
		return "Master Controller";
	}

	@Override
	public String getHelpSetName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setJarFile(String jarFile) {
		this.jarFile = jarFile;
	}

	@Override
	public String getJarFile() {
		return jarFile;
	}

	@Override
	public String getDeveloperName() {
		return "Douglas Gillespie";
	}

	@Override
	public String getContactEmail() {
		return "info@pamguard.org";
	}

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return "1.0";
	}

	@Override
	public String getPamVerDevelopedOn() {
		return "2.02.03";
	}

	@Override
	public String getPamVerTestedOn() {
		return "2.02.03";
	}

	@Override
	public String getAboutText() {
		return "Master PAMGuard controller and automatic sperm whale detection developed for ALFA";
	}

	@Override
	public String getClassName() {
		return ALFAControl.class.getName();
	}

	@Override
	public String getDescription() {
		return getDefaultName();
	}

	@Override
	public String getMenuGroup() {
		return "Utilities";
	}

	@Override
	public String getToolTip() {
		return getDescription();
	}

	@Override
	public PamDependency getDependency() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMinNumber() {
		return 0;
	}

	@Override
	public int getMaxNumber() {
		return 1;
	}

	@Override
	public int getNInstances() {
		return 0;
	}

	@Override
	public boolean isItHidden() {
		return false;
	}

	@Override
	public int allowedModes() {
		return PamPluginInterface.ALLMODES;
	}

}
