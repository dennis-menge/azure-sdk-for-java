// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.InboundEndpointProtocol;
import com.azure.resourcemanager.batch.models.InboundNatPool;
import com.azure.resourcemanager.batch.models.NetworkSecurityGroupRule;
import com.azure.resourcemanager.batch.models.NetworkSecurityGroupRuleAccess;
import com.azure.resourcemanager.batch.models.PoolEndpointConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PoolEndpointConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PoolEndpointConfiguration model =
            BinaryData
                .fromString(
                    "{\"inboundNatPools\":[{\"name\":\"hgw\",\"protocol\":\"UDP\",\"backendPort\":1561921505,\"frontendPortRangeStart\":1856225206,\"frontendPortRangeEnd\":633865702,\"networkSecurityGroupRules\":[{\"priority\":436968596,\"access\":\"Deny\",\"sourceAddressPrefix\":\"cvkcvqvpkeqdcv\",\"sourcePortRanges\":[\"vo\",\"dsotbobzd\",\"pcjwv\",\"hdldwmgxcxrsl\"]},{\"priority\":1846533498,\"access\":\"Allow\",\"sourceAddressPrefix\":\"twuoegrpkhjwni\",\"sourcePortRanges\":[\"luicpdggkzzlvmbm\",\"axmodfvuef\",\"wsbpfvm\"]}]},{\"name\":\"yhrfouyftaakcpw\",\"protocol\":\"TCP\",\"backendPort\":1040923285,\"frontendPortRangeStart\":1777343462,\"frontendPortRangeEnd\":842537299,\"networkSecurityGroupRules\":[{\"priority\":1349275484,\"access\":\"Allow\",\"sourceAddressPrefix\":\"bexkpzksmondj\",\"sourcePortRanges\":[\"xvy\",\"omgkopkwho\",\"v\",\"ajqgxy\"]},{\"priority\":608982569,\"access\":\"Deny\",\"sourceAddressPrefix\":\"cmbqfqvmk\",\"sourcePortRanges\":[\"zapvhelx\"]},{\"priority\":1009044014,\"access\":\"Deny\",\"sourceAddressPrefix\":\"lya\",\"sourcePortRanges\":[\"ckcb\",\"uejrjxgc\"]},{\"priority\":2014016933,\"access\":\"Deny\",\"sourceAddressPrefix\":\"brh\",\"sourcePortRanges\":[\"sdqrhzoymibmrq\",\"ibahwflus\",\"dtmhrkwofyyvoqa\",\"piexpbtgiw\"]}]},{\"name\":\"wo\",\"protocol\":\"TCP\",\"backendPort\":1119495390,\"frontendPortRangeStart\":1273171944,\"frontendPortRangeEnd\":1338594793,\"networkSecurityGroupRules\":[{\"priority\":1437080667,\"access\":\"Deny\",\"sourceAddressPrefix\":\"tkcnqxwb\",\"sourcePortRanges\":[\"ulpiuj\",\"aasipqi\",\"obyu\"]},{\"priority\":1435742005,\"access\":\"Allow\",\"sourceAddressPrefix\":\"pqlpq\",\"sourcePortRanges\":[\"iuqgbdbutauv\",\"btkuwhh\"]},{\"priority\":1986574356,\"access\":\"Deny\",\"sourceAddressPrefix\":\"k\",\"sourcePortRanges\":[\"xafnndlpichko\",\"mkcdyhbpkkpwdre\"]}]},{\"name\":\"novvqfovljxy\",\"protocol\":\"UDP\",\"backendPort\":1676739337,\"frontendPortRangeStart\":19956965,\"frontendPortRangeEnd\":2009471016,\"networkSecurityGroupRules\":[{\"priority\":188945883,\"access\":\"Deny\",\"sourceAddressPrefix\":\"dsytgadgvr\",\"sourcePortRanges\":[\"en\",\"qnzarrwl\",\"uu\"]},{\"priority\":1309534736,\"access\":\"Allow\",\"sourceAddressPrefix\":\"qkacewii\",\"sourcePortRanges\":[\"ubjibww\",\"f\"]},{\"priority\":1572357139,\"access\":\"Deny\",\"sourceAddressPrefix\":\"qkvpuvksgplsakn\",\"sourcePortRanges\":[\"synljphuopxodl\",\"iyntorzihle\",\"sjswsrms\"]},{\"priority\":1609130326,\"access\":\"Allow\",\"sourceAddressPrefix\":\"rpzbchckqqzqi\",\"sourcePortRanges\":[\"ysuiizynkedya\",\"rwyhqmibzyhwitsm\"]}]}]}")
                .toObject(PoolEndpointConfiguration.class);
        Assertions.assertEquals("hgw", model.inboundNatPools().get(0).name());
        Assertions.assertEquals(InboundEndpointProtocol.UDP, model.inboundNatPools().get(0).protocol());
        Assertions.assertEquals(1561921505, model.inboundNatPools().get(0).backendPort());
        Assertions.assertEquals(1856225206, model.inboundNatPools().get(0).frontendPortRangeStart());
        Assertions.assertEquals(633865702, model.inboundNatPools().get(0).frontendPortRangeEnd());
        Assertions
            .assertEquals(436968596, model.inboundNatPools().get(0).networkSecurityGroupRules().get(0).priority());
        Assertions
            .assertEquals(
                NetworkSecurityGroupRuleAccess.DENY,
                model.inboundNatPools().get(0).networkSecurityGroupRules().get(0).access());
        Assertions
            .assertEquals(
                "cvkcvqvpkeqdcv",
                model.inboundNatPools().get(0).networkSecurityGroupRules().get(0).sourceAddressPrefix());
        Assertions
            .assertEquals(
                "vo", model.inboundNatPools().get(0).networkSecurityGroupRules().get(0).sourcePortRanges().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PoolEndpointConfiguration model =
            new PoolEndpointConfiguration()
                .withInboundNatPools(
                    Arrays
                        .asList(
                            new InboundNatPool()
                                .withName("hgw")
                                .withProtocol(InboundEndpointProtocol.UDP)
                                .withBackendPort(1561921505)
                                .withFrontendPortRangeStart(1856225206)
                                .withFrontendPortRangeEnd(633865702)
                                .withNetworkSecurityGroupRules(
                                    Arrays
                                        .asList(
                                            new NetworkSecurityGroupRule()
                                                .withPriority(436968596)
                                                .withAccess(NetworkSecurityGroupRuleAccess.DENY)
                                                .withSourceAddressPrefix("cvkcvqvpkeqdcv")
                                                .withSourcePortRanges(
                                                    Arrays.asList("vo", "dsotbobzd", "pcjwv", "hdldwmgxcxrsl")),
                                            new NetworkSecurityGroupRule()
                                                .withPriority(1846533498)
                                                .withAccess(NetworkSecurityGroupRuleAccess.ALLOW)
                                                .withSourceAddressPrefix("twuoegrpkhjwni")
                                                .withSourcePortRanges(
                                                    Arrays.asList("luicpdggkzzlvmbm", "axmodfvuef", "wsbpfvm")))),
                            new InboundNatPool()
                                .withName("yhrfouyftaakcpw")
                                .withProtocol(InboundEndpointProtocol.TCP)
                                .withBackendPort(1040923285)
                                .withFrontendPortRangeStart(1777343462)
                                .withFrontendPortRangeEnd(842537299)
                                .withNetworkSecurityGroupRules(
                                    Arrays
                                        .asList(
                                            new NetworkSecurityGroupRule()
                                                .withPriority(1349275484)
                                                .withAccess(NetworkSecurityGroupRuleAccess.ALLOW)
                                                .withSourceAddressPrefix("bexkpzksmondj")
                                                .withSourcePortRanges(
                                                    Arrays.asList("xvy", "omgkopkwho", "v", "ajqgxy")),
                                            new NetworkSecurityGroupRule()
                                                .withPriority(608982569)
                                                .withAccess(NetworkSecurityGroupRuleAccess.DENY)
                                                .withSourceAddressPrefix("cmbqfqvmk")
                                                .withSourcePortRanges(Arrays.asList("zapvhelx")),
                                            new NetworkSecurityGroupRule()
                                                .withPriority(1009044014)
                                                .withAccess(NetworkSecurityGroupRuleAccess.DENY)
                                                .withSourceAddressPrefix("lya")
                                                .withSourcePortRanges(Arrays.asList("ckcb", "uejrjxgc")),
                                            new NetworkSecurityGroupRule()
                                                .withPriority(2014016933)
                                                .withAccess(NetworkSecurityGroupRuleAccess.DENY)
                                                .withSourceAddressPrefix("brh")
                                                .withSourcePortRanges(
                                                    Arrays
                                                        .asList(
                                                            "sdqrhzoymibmrq",
                                                            "ibahwflus",
                                                            "dtmhrkwofyyvoqa",
                                                            "piexpbtgiw")))),
                            new InboundNatPool()
                                .withName("wo")
                                .withProtocol(InboundEndpointProtocol.TCP)
                                .withBackendPort(1119495390)
                                .withFrontendPortRangeStart(1273171944)
                                .withFrontendPortRangeEnd(1338594793)
                                .withNetworkSecurityGroupRules(
                                    Arrays
                                        .asList(
                                            new NetworkSecurityGroupRule()
                                                .withPriority(1437080667)
                                                .withAccess(NetworkSecurityGroupRuleAccess.DENY)
                                                .withSourceAddressPrefix("tkcnqxwb")
                                                .withSourcePortRanges(Arrays.asList("ulpiuj", "aasipqi", "obyu")),
                                            new NetworkSecurityGroupRule()
                                                .withPriority(1435742005)
                                                .withAccess(NetworkSecurityGroupRuleAccess.ALLOW)
                                                .withSourceAddressPrefix("pqlpq")
                                                .withSourcePortRanges(Arrays.asList("iuqgbdbutauv", "btkuwhh")),
                                            new NetworkSecurityGroupRule()
                                                .withPriority(1986574356)
                                                .withAccess(NetworkSecurityGroupRuleAccess.DENY)
                                                .withSourceAddressPrefix("k")
                                                .withSourcePortRanges(
                                                    Arrays.asList("xafnndlpichko", "mkcdyhbpkkpwdre")))),
                            new InboundNatPool()
                                .withName("novvqfovljxy")
                                .withProtocol(InboundEndpointProtocol.UDP)
                                .withBackendPort(1676739337)
                                .withFrontendPortRangeStart(19956965)
                                .withFrontendPortRangeEnd(2009471016)
                                .withNetworkSecurityGroupRules(
                                    Arrays
                                        .asList(
                                            new NetworkSecurityGroupRule()
                                                .withPriority(188945883)
                                                .withAccess(NetworkSecurityGroupRuleAccess.DENY)
                                                .withSourceAddressPrefix("dsytgadgvr")
                                                .withSourcePortRanges(Arrays.asList("en", "qnzarrwl", "uu")),
                                            new NetworkSecurityGroupRule()
                                                .withPriority(1309534736)
                                                .withAccess(NetworkSecurityGroupRuleAccess.ALLOW)
                                                .withSourceAddressPrefix("qkacewii")
                                                .withSourcePortRanges(Arrays.asList("ubjibww", "f")),
                                            new NetworkSecurityGroupRule()
                                                .withPriority(1572357139)
                                                .withAccess(NetworkSecurityGroupRuleAccess.DENY)
                                                .withSourceAddressPrefix("qkvpuvksgplsakn")
                                                .withSourcePortRanges(
                                                    Arrays.asList("synljphuopxodl", "iyntorzihle", "sjswsrms")),
                                            new NetworkSecurityGroupRule()
                                                .withPriority(1609130326)
                                                .withAccess(NetworkSecurityGroupRuleAccess.ALLOW)
                                                .withSourceAddressPrefix("rpzbchckqqzqi")
                                                .withSourcePortRanges(
                                                    Arrays.asList("ysuiizynkedya", "rwyhqmibzyhwitsm"))))));
        model = BinaryData.fromObject(model).toObject(PoolEndpointConfiguration.class);
        Assertions.assertEquals("hgw", model.inboundNatPools().get(0).name());
        Assertions.assertEquals(InboundEndpointProtocol.UDP, model.inboundNatPools().get(0).protocol());
        Assertions.assertEquals(1561921505, model.inboundNatPools().get(0).backendPort());
        Assertions.assertEquals(1856225206, model.inboundNatPools().get(0).frontendPortRangeStart());
        Assertions.assertEquals(633865702, model.inboundNatPools().get(0).frontendPortRangeEnd());
        Assertions
            .assertEquals(436968596, model.inboundNatPools().get(0).networkSecurityGroupRules().get(0).priority());
        Assertions
            .assertEquals(
                NetworkSecurityGroupRuleAccess.DENY,
                model.inboundNatPools().get(0).networkSecurityGroupRules().get(0).access());
        Assertions
            .assertEquals(
                "cvkcvqvpkeqdcv",
                model.inboundNatPools().get(0).networkSecurityGroupRules().get(0).sourceAddressPrefix());
        Assertions
            .assertEquals(
                "vo", model.inboundNatPools().get(0).networkSecurityGroupRules().get(0).sourcePortRanges().get(0));
    }
}
