package com.monsanto.arch.awsutil.s3.model

import com.amazonaws.services.s3.{model ⇒ aws}
import com.monsanto.arch.awsutil.util.{AwsEnumeration, AwsEnumerationCompanion}

abstract class Region(val toAws: aws.Region) extends AwsEnumeration[aws.Region]

object Region extends AwsEnumerationCompanion[Region,aws.Region] {
  /** The US Standard Amazon S3 Region. This region uses Amazon S3 servers located in the United States.
    *
    * This is the default Amazon S3 Region. All requests sent to `s3.amazonaws.com` go to this region unless a
    * location constraint is specified when creating a bucket.  The US Standard Region automatically places data in
    * either Amazon's east or west coast data centers depending on which one provides the lowest latency.
    */
  case object US_Standard extends Region(aws.Region.US_Standard)

  /**
    * The US-West (Northern California) Amazon S3 Region. This region uses Amazon S3 servers located in Northern
    * California.
    *
    * When using buckets in this region, set the client endpoint to `s3-us-west-1.amazonaws.com` on all
    * requests to these buckets to reduce any latency experienced after the first hour of creating a bucket in this region.
    */
  case object US_West extends Region(aws.Region.US_West)
  /**
    * The US-East-2 (Ohio) Amazon S3 Region. This region uses Amazon S3 servers located in Ohio.
    *
    * When using buckets in this region, set the client endpoint to `s3-us-east-2.amazonaws.com` on all
    * requests to these buckets to reduce any latency experienced after the first hour of creating a bucket in this region.
    */

  case object US_East_2 extends Region(aws.Region.US_East_2)

  /** The US-West-2 (Oregon) Region. This region uses Amazon S3 servers located in Oregon.
    *
    * When using buckets in this region, set the client endpoint to `s3-us-west-2.amazonaws.com` on all requests to
    * these buckets to reduce any latency experienced after the first hour of creating a bucket in this region.
    */
  case object US_West_2 extends Region(aws.Region.US_West_2)

  /** The US GovCloud Region. This region uses Amazon S3 servers located in the Northwestern region of the United
    * States.
    */
  case object US_GovCloud extends Region(aws.Region.US_GovCloud)

  /** The EU (Ireland) Amazon S3 Region. This region uses Amazon S3 servers located in Ireland. */
  case object EU_Ireland extends Region(aws.Region.EU_Ireland)

  /** The EU (Frankfurt) Amazon S3 Region. This region uses Amazon S3 servers located in Frankfurt. */
  case object EU_Frankfurt extends Region(aws.Region.EU_Frankfurt)

  /** The EU (London) Amazon S3 Region. This region uses Amazon S3 servers located in London. */
  case object EU_London extends Region(aws.Region.EU_London)

  /** The EU (Paris) Amazon S3 Region. This region uses Amazon S3 servers located in Paris. */
  case object EU_Paris extends Region(aws.Region.EU_Paris)

  /** The Asia Pacific (Singapore) Region. This region uses Amazon S3 servers located in Singapore.
    *
    * When using buckets in this region, set the client endpoint to `s3-ap-southeast-1.amazonaws.com` on all requests
    * to these buckets to reduce any latency experienced after the first hour of creating a bucket in this region.
    */
  case object AP_Singapore extends Region(aws.Region.AP_Singapore)

  /** The Asia Pacific (Sydney) Region. This region uses Amazon S3 servers located in Sydney, Australia.
    *
    * When using buckets in this region, set the client endpoint to `s3-ap-southeast-2.amazonaws.com` on all requests
    * to these buckets to reduce any latency experienced after the first hour of creating a bucket in this region.
    */
  case object AP_Sydney extends Region(aws.Region.AP_Sydney)

  /** The Asia Pacific (Tokyo) Region. This region uses Amazon S3 servers located in Tokyo.
    *
    * When using buckets in this region, set the client endpoint to `s3-ap-northeast-1.amazonaws.com` on all requests
    * to these buckets to reduce any latency experienced after the first hour of creating a bucket in this region.
    */
  case object AP_Tokyo extends Region(aws.Region.AP_Tokyo)

  /** The Asia Pacific (Seoul) Region. This region uses Amazon S3 servers located in Seoul.
    *
    * When using buckets in this region, set the client endpoint to `s3.ap-northeast-2.amazonaws.com` on all requests
    * to these buckets to reduce any latency experienced after the first hour of creating a bucket in this region.
    */
  case object AP_Seoul extends Region(aws.Region.AP_Seoul)

  /** The Asia Pacific (Mumbai) Region. This region uses Amazon S3 servers located in Mumbai.
    *
    * When using buckets in this region, set the client endpoint to `s3.ap-south-1.amazonaws.com` on all requests
    * to these buckets to reduce any latency experienced after the first hour of creating a bucket in this region.
    */
  case object AP_Mumbai extends Region(aws.Region.AP_Mumbai)

  /** The South America (Sao Paulo) Region. This region uses Amazon S3 servers located in Sao Paulo.
    *
    * When using buckets in this region, set the client endpoint to `s3-sa-east-1.amazonaws.com` on all requests to
    * these buckets to reduce any latency experienced after the first hour of creating a bucket in this region.
    */
  case object SA_SaoPaulo extends Region(aws.Region.SA_SaoPaulo)

  /** The China (Beijing) Region. This region uses Amazon S3 servers located in Beijing.
    *
    * When using buckets in this region, you must set the client endpoint to `s3.cn-north-1.amazonaws.com.cn`.
    */
  case object CN_Beijing extends Region(aws.Region.CN_Beijing)

  /** The China (Ningxia) Region. This region uses Amazon S3 servers located in Ningxia.
    *
    * When using buckets in this region, you must set the client endpoint to `s3.cn-northwest-1.amazonaws.com.cn`.
    */
  case object CN_Northwest_1 extends Region(aws.Region.CN_Northwest_1)

  /** The Canada (Central)	 Region. This region uses Amazon S3 servers located in Canada.
    *
    */
  case object CA_Central extends Region(aws.Region.CA_Central)

  /** All valid values for the enumeration. */
  override def values: Seq[Region] =
    Seq(US_Standard, US_West, US_West_2, US_East_2, US_GovCloud, AP_Seoul, AP_Singapore, AP_Singapore, AP_Sydney,
      AP_Tokyo, AP_Mumbai, EU_Ireland, EU_Frankfurt, EU_London, EU_Paris, CN_Beijing, CN_Northwest_1, SA_SaoPaulo,
      CA_Central)
}
