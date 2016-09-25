package test.version;

/**
 * The Class VersionInfo. Represents the current API version.
 */
public class VersionInfo
{
	/** The display name. */
	private static String mDisplayName = "%PROJECT_NAME%";

	/** The display version. */
	private static String mDisplayVersion = "%BUILD_FULLVER%";

	/** The member release. */
	private static String mRelease = "%BUILD_VER%";
	
	/** The member subrelease. */
	private static String mSubrelease = "%BUILD_SVER%";
	
	/** The member build. */
	private static String mBuild = "%BUILD_ID%";

	private static String mTimestamp = "%BUILD_TSTAMP%";

	private static String mUniqueIdentifier = "%BUILD_UID%";
	
	/**
	 * Gets the project name.
	 *
	 * @return the version
	 */
	public static String getDisplayName()
	{
		return mDisplayName;
	}

	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	public static String getVersion()
	{
		return mDisplayVersion;
	}
	
	/**
	 * Gets the release.
	 *
	 * @return the release
	 */
	public static String getRelease()
	{
		return mRelease;
	}
	
	/**
	 * Gets the sub releases.
	 *
	 * @return the sub releases
	 */
	public static String getSubReleases()
	{
		return mSubrelease;
	}
	
	/**
	 * Gets the build.
	 *
	 * @return the build
	 */
	public static String getBuild()
	{
		return mBuild;
	}

    /**
	 * Gets the build timestamp.
	 *
	 * @return the build
	 */
	public static String getBuildTimestamp()
	{
		return mTimestamp;
	}

	/**
	 * Gets the build unique id.
	 *
	 * @return the build
	 */
	public static String getBuildUID()
	{
		return mUniqueIdentifier;
	}
	
}
