SUMMARY = "Qualcomm WiFi driver for QCA module 9377 and 6174"
LICENSE = "BSD & GPLv2"
LIC_FILES_CHKSUM = "file://CORE/HDD/src/wlan_hdd_main.c;beginline=1;endline=20;md5=ec8d62116b13db773825ebf7cf91be1d;"

QCACLD_SRC ?= "git://github.com/nxp-imx/qcacld-2.0-imx.git;protocol=https"
SRC_URI = "${QCACLD_SRC};branch=IMX_CNSS.LEA.NRT_2.0"
SRCREV = "6b4f72af0acb54a74dca6eafc5451617a1c49ba7"

S = "${WORKDIR}/git"

inherit module

EXTRA_OEMAKE += " \
    CONFIG_CFG80211_INTERNAL_REGDB=y \
    CONFIG_HDD_WLAN_WAIT_TIME=10000 \
    CONFIG_LINUX_QCMBR=y \
    CONFIG_NON_QC_PLATFORM=y \
    CONFIG_PMF_SUPPORT=y \
    TARGET_BUILD_VARIANT=user \
"

RDEPENDS_${PN} = "qca-tools"
