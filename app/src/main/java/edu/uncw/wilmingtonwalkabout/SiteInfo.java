package edu.uncw.wilmingtonwalkabout;

public class SiteInfo {
    private String name;
    private String description;
    private int imageRid;
    private String website;

    public static final SiteInfo[] sites = {
            new SiteInfo("Battleship North Carolina",
                    "The first USS NORTH CAROLINA, a 74-gun ship of the line, was launched in Philadelphia, September 1820, and fitted out in Norfolk, Virginia, with Master Commandant Charles W. Morgan in command. A three-masted square-rigger with an overall length of 196 feet 3 inches and beam of 54 feet, she displaced 2,633 tons and carried a complement of 820. As Commodore John Rodgers’ flagship in the Mediterranean from 1825-1827, NORTH CAROLINA symbolized naval might and provided the young republic much-needed prestige and respectability. Her second voyage was in the Pacific Squadron from 1836-1839. Then the Ship-of-the-Line became a receiving [training] ship in New York Navy Yard and was sold for scrap in 1867.\n" +
                                "\n\nThe Confederate States Navy’s 174-foot ironclad CSS NORTH CAROLINA was constructed in Wilmington, North Carolina, near the site of Battleship NORTH CAROLINA. Displacing 600 tons, her main battery consisted of four 8-inch guns and her complement of 150 men. She was anchored near the mouth of the Cape Fear River to help keep the port of Wilmington open for blockade runners. She developed leaks and sank in September 1864 near Southport, North Carolina.",
                                R.drawable.battleshipnc, "https://www.wilmingtonandbeaches.com/listing/battleship-north-carolina/81/"),
            new SiteInfo("Cape Fear Museum of History and Science",
                    "In March of 1898, the United Daughters of the Confederacy (UDC) first opened the Museum in one room on the second floor of the Wilmington Light Infantry’s (WLI) building. Since its founding, the Museum has moved around the city. It was housed in two rooms in the County courthouse annex in the late 1920s, and then on the third floor of the Police Station building in the 1960s. Since 1970, it has been located at 814 Market Street, in what was a National Guard Armory building. In the late 1980s, local residents supported a bond issue for Museum improvements. In 1992, the Museum opened with new exhibits in a renovated and expanded space.\n" +
                                "\n\nThe Museum has also been run by four different organizations over the course of its history. After the UDC steered the Museum through its first two decades, they lost their room at the WLI during World War I. The Museum’s artifact collection went to Raleigh at that time. After the war, it took a decade for Wilmington – through the work of the New Hanover County Historical Commission and the UDC – to reclaim the items. When the collection returned and the Museum reopened, a different women’s organization, North Carolina Sorosis, took over operations. They ran the Museum from 1930 until the early 1960s. Then, the City of Wilmington and New Hanover County jointly administered the Museum until the county took sole administrative control in 1977.\n" ,
                                R.drawable.cfmlogo, "https://www.wilmingtonandbeaches.com/listing/cape-fear-museum-of-history-and-science/136/"),
            new SiteInfo("Carolina Beach State Park",
                    "In March of 1898, the United Daughters of the Confederacy (UDC) first opened the Museum in one room on the second floor of the Wilmington Light Infantry’s (WLI) building. Since its founding, the Museum has moved around the city. It was housed in two rooms in the County courthouse annex in the late 1920s, and then on the third floor of the Police Station building in the 1960s. Since 1970, it has been located at 814 Market Street, in what was a National Guard Armory building. In the late 1980s, local residents supported a bond issue for Museum improvements. In 1992, the Museum opened with new exhibits in a renovated and expanded space.\n" +
                                "\n\nThe Museum has also been run by four different organizations over the course of its history. After the UDC steered the Museum through its first two decades, they lost their room at the WLI during World War I. The Museum’s artifact collection went to Raleigh at that time. After the war, it took a decade for Wilmington – through the work of the New Hanover County Historical Commission and the UDC – to reclaim the items. When the collection returned and the Museum reopened, a different women’s organization, North Carolina Sorosis, took over operations. They ran the Museum from 1930 until the early 1960s. Then, the City of Wilmington and New Hanover County jointly administered the Museum until the county took sole administrative control in 1977.\n" ,
                                R.drawable.carolinabeach, "https://www.wilmingtonandbeaches.com/listing/carolina-beach-state-park/151/")
    };


    private SiteInfo(String name, String description, int imageRid, String website) {
        this.name = name;
        this.description = description;
        this.imageRid = imageRid;
        this.website = website;

    }


        public String getDescription() {
            return description;
        }

        public String getName() {
           return name;
        }

        public int getImageRid() {
            return imageRid;
        }

        public String getWebsite() {
            return website;
        }

        public String toString() {
            return this.name;
        }
}


