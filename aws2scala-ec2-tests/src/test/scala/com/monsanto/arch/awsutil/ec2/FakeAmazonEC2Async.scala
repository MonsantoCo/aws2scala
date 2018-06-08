package com.monsanto.arch.awsutil.ec2

import java.util.concurrent.Future

import com.amazonaws.handlers.AsyncHandler
import com.amazonaws.regions.Region
import com.amazonaws.services.ec2.AmazonEC2Async
import com.amazonaws.services.ec2.model._
import com.amazonaws.services.ec2.waiters.AmazonEC2Waiters
import com.amazonaws.{AmazonWebServiceRequest, ResponseMetadata}

//noinspection NotImplementedCode
class FakeAmazonEC2Async extends AmazonEC2Async {
  override def acceptReservedInstancesExchangeQuoteAsync(acceptReservedInstancesExchangeQuoteRequest: AcceptReservedInstancesExchangeQuoteRequest): Future[AcceptReservedInstancesExchangeQuoteResult] = ???

  override def acceptReservedInstancesExchangeQuoteAsync(acceptReservedInstancesExchangeQuoteRequest: AcceptReservedInstancesExchangeQuoteRequest, asyncHandler: AsyncHandler[AcceptReservedInstancesExchangeQuoteRequest, AcceptReservedInstancesExchangeQuoteResult]): Future[AcceptReservedInstancesExchangeQuoteResult] = ???

  override def acceptVpcEndpointConnectionsAsync(acceptVpcEndpointConnectionsRequest: AcceptVpcEndpointConnectionsRequest): Future[AcceptVpcEndpointConnectionsResult] = ???

  override def acceptVpcEndpointConnectionsAsync(acceptVpcEndpointConnectionsRequest: AcceptVpcEndpointConnectionsRequest, asyncHandler: AsyncHandler[AcceptVpcEndpointConnectionsRequest, AcceptVpcEndpointConnectionsResult]): Future[AcceptVpcEndpointConnectionsResult] = ???

  override def acceptVpcPeeringConnectionAsync(acceptVpcPeeringConnectionRequest: AcceptVpcPeeringConnectionRequest): Future[AcceptVpcPeeringConnectionResult] = ???

  override def acceptVpcPeeringConnectionAsync(acceptVpcPeeringConnectionRequest: AcceptVpcPeeringConnectionRequest, asyncHandler: AsyncHandler[AcceptVpcPeeringConnectionRequest, AcceptVpcPeeringConnectionResult]): Future[AcceptVpcPeeringConnectionResult] = ???

  override def acceptVpcPeeringConnectionAsync(): Future[AcceptVpcPeeringConnectionResult] = ???

  override def acceptVpcPeeringConnectionAsync(asyncHandler: AsyncHandler[AcceptVpcPeeringConnectionRequest, AcceptVpcPeeringConnectionResult]): Future[AcceptVpcPeeringConnectionResult] = ???

  override def allocateAddressAsync(allocateAddressRequest: AllocateAddressRequest): Future[AllocateAddressResult] = ???

  override def allocateAddressAsync(allocateAddressRequest: AllocateAddressRequest, asyncHandler: AsyncHandler[AllocateAddressRequest, AllocateAddressResult]): Future[AllocateAddressResult] = ???

  override def allocateAddressAsync(): Future[AllocateAddressResult] = ???

  override def allocateAddressAsync(asyncHandler: AsyncHandler[AllocateAddressRequest, AllocateAddressResult]): Future[AllocateAddressResult] = ???

  override def allocateHostsAsync(allocateHostsRequest: AllocateHostsRequest): Future[AllocateHostsResult] = ???

  override def allocateHostsAsync(allocateHostsRequest: AllocateHostsRequest, asyncHandler: AsyncHandler[AllocateHostsRequest, AllocateHostsResult]): Future[AllocateHostsResult] = ???

  override def assignIpv6AddressesAsync(assignIpv6AddressesRequest: AssignIpv6AddressesRequest): Future[AssignIpv6AddressesResult] = ???

  override def assignIpv6AddressesAsync(assignIpv6AddressesRequest: AssignIpv6AddressesRequest, asyncHandler: AsyncHandler[AssignIpv6AddressesRequest, AssignIpv6AddressesResult]): Future[AssignIpv6AddressesResult] = ???

  override def assignPrivateIpAddressesAsync(assignPrivateIpAddressesRequest: AssignPrivateIpAddressesRequest): Future[AssignPrivateIpAddressesResult] = ???

  override def assignPrivateIpAddressesAsync(assignPrivateIpAddressesRequest: AssignPrivateIpAddressesRequest, asyncHandler: AsyncHandler[AssignPrivateIpAddressesRequest, AssignPrivateIpAddressesResult]): Future[AssignPrivateIpAddressesResult] = ???

  override def associateAddressAsync(associateAddressRequest: AssociateAddressRequest): Future[AssociateAddressResult] = ???

  override def associateAddressAsync(associateAddressRequest: AssociateAddressRequest, asyncHandler: AsyncHandler[AssociateAddressRequest, AssociateAddressResult]): Future[AssociateAddressResult] = ???

  override def associateDhcpOptionsAsync(associateDhcpOptionsRequest: AssociateDhcpOptionsRequest): Future[AssociateDhcpOptionsResult] = ???

  override def associateDhcpOptionsAsync(associateDhcpOptionsRequest: AssociateDhcpOptionsRequest, asyncHandler: AsyncHandler[AssociateDhcpOptionsRequest, AssociateDhcpOptionsResult]): Future[AssociateDhcpOptionsResult] = ???

  override def associateIamInstanceProfileAsync(associateIamInstanceProfileRequest: AssociateIamInstanceProfileRequest): Future[AssociateIamInstanceProfileResult] = ???

  override def associateIamInstanceProfileAsync(associateIamInstanceProfileRequest: AssociateIamInstanceProfileRequest, asyncHandler: AsyncHandler[AssociateIamInstanceProfileRequest, AssociateIamInstanceProfileResult]): Future[AssociateIamInstanceProfileResult] = ???

  override def associateRouteTableAsync(associateRouteTableRequest: AssociateRouteTableRequest): Future[AssociateRouteTableResult] = ???

  override def associateRouteTableAsync(associateRouteTableRequest: AssociateRouteTableRequest, asyncHandler: AsyncHandler[AssociateRouteTableRequest, AssociateRouteTableResult]): Future[AssociateRouteTableResult] = ???

  override def associateSubnetCidrBlockAsync(associateSubnetCidrBlockRequest: AssociateSubnetCidrBlockRequest): Future[AssociateSubnetCidrBlockResult] = ???

  override def associateSubnetCidrBlockAsync(associateSubnetCidrBlockRequest: AssociateSubnetCidrBlockRequest, asyncHandler: AsyncHandler[AssociateSubnetCidrBlockRequest, AssociateSubnetCidrBlockResult]): Future[AssociateSubnetCidrBlockResult] = ???

  override def associateVpcCidrBlockAsync(associateVpcCidrBlockRequest: AssociateVpcCidrBlockRequest): Future[AssociateVpcCidrBlockResult] = ???

  override def associateVpcCidrBlockAsync(associateVpcCidrBlockRequest: AssociateVpcCidrBlockRequest, asyncHandler: AsyncHandler[AssociateVpcCidrBlockRequest, AssociateVpcCidrBlockResult]): Future[AssociateVpcCidrBlockResult] = ???

  override def attachClassicLinkVpcAsync(attachClassicLinkVpcRequest: AttachClassicLinkVpcRequest): Future[AttachClassicLinkVpcResult] = ???

  override def attachClassicLinkVpcAsync(attachClassicLinkVpcRequest: AttachClassicLinkVpcRequest, asyncHandler: AsyncHandler[AttachClassicLinkVpcRequest, AttachClassicLinkVpcResult]): Future[AttachClassicLinkVpcResult] = ???

  override def attachInternetGatewayAsync(attachInternetGatewayRequest: AttachInternetGatewayRequest): Future[AttachInternetGatewayResult] = ???

  override def attachInternetGatewayAsync(attachInternetGatewayRequest: AttachInternetGatewayRequest, asyncHandler: AsyncHandler[AttachInternetGatewayRequest, AttachInternetGatewayResult]): Future[AttachInternetGatewayResult] = ???

  override def attachNetworkInterfaceAsync(attachNetworkInterfaceRequest: AttachNetworkInterfaceRequest): Future[AttachNetworkInterfaceResult] = ???

  override def attachNetworkInterfaceAsync(attachNetworkInterfaceRequest: AttachNetworkInterfaceRequest, asyncHandler: AsyncHandler[AttachNetworkInterfaceRequest, AttachNetworkInterfaceResult]): Future[AttachNetworkInterfaceResult] = ???

  override def attachVolumeAsync(attachVolumeRequest: AttachVolumeRequest): Future[AttachVolumeResult] = ???

  override def attachVolumeAsync(attachVolumeRequest: AttachVolumeRequest, asyncHandler: AsyncHandler[AttachVolumeRequest, AttachVolumeResult]): Future[AttachVolumeResult] = ???

  override def attachVpnGatewayAsync(attachVpnGatewayRequest: AttachVpnGatewayRequest): Future[AttachVpnGatewayResult] = ???

  override def attachVpnGatewayAsync(attachVpnGatewayRequest: AttachVpnGatewayRequest, asyncHandler: AsyncHandler[AttachVpnGatewayRequest, AttachVpnGatewayResult]): Future[AttachVpnGatewayResult] = ???

  override def authorizeSecurityGroupEgressAsync(authorizeSecurityGroupEgressRequest: AuthorizeSecurityGroupEgressRequest): Future[AuthorizeSecurityGroupEgressResult] = ???

  override def authorizeSecurityGroupEgressAsync(authorizeSecurityGroupEgressRequest: AuthorizeSecurityGroupEgressRequest, asyncHandler: AsyncHandler[AuthorizeSecurityGroupEgressRequest, AuthorizeSecurityGroupEgressResult]): Future[AuthorizeSecurityGroupEgressResult] = ???

  override def authorizeSecurityGroupIngressAsync(authorizeSecurityGroupIngressRequest: AuthorizeSecurityGroupIngressRequest): Future[AuthorizeSecurityGroupIngressResult] = ???

  override def authorizeSecurityGroupIngressAsync(authorizeSecurityGroupIngressRequest: AuthorizeSecurityGroupIngressRequest, asyncHandler: AsyncHandler[AuthorizeSecurityGroupIngressRequest, AuthorizeSecurityGroupIngressResult]): Future[AuthorizeSecurityGroupIngressResult] = ???

  override def bundleInstanceAsync(bundleInstanceRequest: BundleInstanceRequest): Future[BundleInstanceResult] = ???

  override def bundleInstanceAsync(bundleInstanceRequest: BundleInstanceRequest, asyncHandler: AsyncHandler[BundleInstanceRequest, BundleInstanceResult]): Future[BundleInstanceResult] = ???

  override def cancelBundleTaskAsync(cancelBundleTaskRequest: CancelBundleTaskRequest): Future[CancelBundleTaskResult] = ???

  override def cancelBundleTaskAsync(cancelBundleTaskRequest: CancelBundleTaskRequest, asyncHandler: AsyncHandler[CancelBundleTaskRequest, CancelBundleTaskResult]): Future[CancelBundleTaskResult] = ???

  override def cancelConversionTaskAsync(cancelConversionTaskRequest: CancelConversionTaskRequest): Future[CancelConversionTaskResult] = ???

  override def cancelConversionTaskAsync(cancelConversionTaskRequest: CancelConversionTaskRequest, asyncHandler: AsyncHandler[CancelConversionTaskRequest, CancelConversionTaskResult]): Future[CancelConversionTaskResult] = ???

  override def cancelExportTaskAsync(cancelExportTaskRequest: CancelExportTaskRequest): Future[CancelExportTaskResult] = ???

  override def cancelExportTaskAsync(cancelExportTaskRequest: CancelExportTaskRequest, asyncHandler: AsyncHandler[CancelExportTaskRequest, CancelExportTaskResult]): Future[CancelExportTaskResult] = ???

  override def cancelImportTaskAsync(cancelImportTaskRequest: CancelImportTaskRequest): Future[CancelImportTaskResult] = ???

  override def cancelImportTaskAsync(cancelImportTaskRequest: CancelImportTaskRequest, asyncHandler: AsyncHandler[CancelImportTaskRequest, CancelImportTaskResult]): Future[CancelImportTaskResult] = ???

  override def cancelImportTaskAsync(): Future[CancelImportTaskResult] = ???

  override def cancelImportTaskAsync(asyncHandler: AsyncHandler[CancelImportTaskRequest, CancelImportTaskResult]): Future[CancelImportTaskResult] = ???

  override def cancelReservedInstancesListingAsync(cancelReservedInstancesListingRequest: CancelReservedInstancesListingRequest): Future[CancelReservedInstancesListingResult] = ???

  override def cancelReservedInstancesListingAsync(cancelReservedInstancesListingRequest: CancelReservedInstancesListingRequest, asyncHandler: AsyncHandler[CancelReservedInstancesListingRequest, CancelReservedInstancesListingResult]): Future[CancelReservedInstancesListingResult] = ???

  override def cancelSpotFleetRequestsAsync(cancelSpotFleetRequestsRequest: CancelSpotFleetRequestsRequest): Future[CancelSpotFleetRequestsResult] = ???

  override def cancelSpotFleetRequestsAsync(cancelSpotFleetRequestsRequest: CancelSpotFleetRequestsRequest, asyncHandler: AsyncHandler[CancelSpotFleetRequestsRequest, CancelSpotFleetRequestsResult]): Future[CancelSpotFleetRequestsResult] = ???

  override def cancelSpotInstanceRequestsAsync(cancelSpotInstanceRequestsRequest: CancelSpotInstanceRequestsRequest): Future[CancelSpotInstanceRequestsResult] = ???

  override def cancelSpotInstanceRequestsAsync(cancelSpotInstanceRequestsRequest: CancelSpotInstanceRequestsRequest, asyncHandler: AsyncHandler[CancelSpotInstanceRequestsRequest, CancelSpotInstanceRequestsResult]): Future[CancelSpotInstanceRequestsResult] = ???

  override def confirmProductInstanceAsync(confirmProductInstanceRequest: ConfirmProductInstanceRequest): Future[ConfirmProductInstanceResult] = ???

  override def confirmProductInstanceAsync(confirmProductInstanceRequest: ConfirmProductInstanceRequest, asyncHandler: AsyncHandler[ConfirmProductInstanceRequest, ConfirmProductInstanceResult]): Future[ConfirmProductInstanceResult] = ???

  override def copyFpgaImageAsync(copyFpgaImageRequest: CopyFpgaImageRequest): Future[CopyFpgaImageResult] = ???

  override def copyFpgaImageAsync(copyFpgaImageRequest: CopyFpgaImageRequest, asyncHandler: AsyncHandler[CopyFpgaImageRequest, CopyFpgaImageResult]): Future[CopyFpgaImageResult] = ???

  override def copyImageAsync(copyImageRequest: CopyImageRequest): Future[CopyImageResult] = ???

  override def copyImageAsync(copyImageRequest: CopyImageRequest, asyncHandler: AsyncHandler[CopyImageRequest, CopyImageResult]): Future[CopyImageResult] = ???

  override def copySnapshotAsync(copySnapshotRequest: CopySnapshotRequest): Future[CopySnapshotResult] = ???

  override def copySnapshotAsync(copySnapshotRequest: CopySnapshotRequest, asyncHandler: AsyncHandler[CopySnapshotRequest, CopySnapshotResult]): Future[CopySnapshotResult] = ???

  override def createCustomerGatewayAsync(createCustomerGatewayRequest: CreateCustomerGatewayRequest): Future[CreateCustomerGatewayResult] = ???

  override def createCustomerGatewayAsync(createCustomerGatewayRequest: CreateCustomerGatewayRequest, asyncHandler: AsyncHandler[CreateCustomerGatewayRequest, CreateCustomerGatewayResult]): Future[CreateCustomerGatewayResult] = ???

  override def createDefaultSubnetAsync(createDefaultSubnetRequest: CreateDefaultSubnetRequest): Future[CreateDefaultSubnetResult] = ???

  override def createDefaultSubnetAsync(createDefaultSubnetRequest: CreateDefaultSubnetRequest, asyncHandler: AsyncHandler[CreateDefaultSubnetRequest, CreateDefaultSubnetResult]): Future[CreateDefaultSubnetResult] = ???

  override def createDefaultVpcAsync(createDefaultVpcRequest: CreateDefaultVpcRequest): Future[CreateDefaultVpcResult] = ???

  override def createDefaultVpcAsync(createDefaultVpcRequest: CreateDefaultVpcRequest, asyncHandler: AsyncHandler[CreateDefaultVpcRequest, CreateDefaultVpcResult]): Future[CreateDefaultVpcResult] = ???

  override def createDhcpOptionsAsync(createDhcpOptionsRequest: CreateDhcpOptionsRequest): Future[CreateDhcpOptionsResult] = ???

  override def createDhcpOptionsAsync(createDhcpOptionsRequest: CreateDhcpOptionsRequest, asyncHandler: AsyncHandler[CreateDhcpOptionsRequest, CreateDhcpOptionsResult]): Future[CreateDhcpOptionsResult] = ???

  override def createEgressOnlyInternetGatewayAsync(createEgressOnlyInternetGatewayRequest: CreateEgressOnlyInternetGatewayRequest): Future[CreateEgressOnlyInternetGatewayResult] = ???

  override def createEgressOnlyInternetGatewayAsync(createEgressOnlyInternetGatewayRequest: CreateEgressOnlyInternetGatewayRequest, asyncHandler: AsyncHandler[CreateEgressOnlyInternetGatewayRequest, CreateEgressOnlyInternetGatewayResult]): Future[CreateEgressOnlyInternetGatewayResult] = ???

  override def createFleetAsync(createFleetRequest: CreateFleetRequest): Future[CreateFleetResult] = ???

  override def createFleetAsync(createFleetRequest: CreateFleetRequest, asyncHandler: AsyncHandler[CreateFleetRequest, CreateFleetResult]): Future[CreateFleetResult] = ???

  override def createFlowLogsAsync(createFlowLogsRequest: CreateFlowLogsRequest): Future[CreateFlowLogsResult] = ???

  override def createFlowLogsAsync(createFlowLogsRequest: CreateFlowLogsRequest, asyncHandler: AsyncHandler[CreateFlowLogsRequest, CreateFlowLogsResult]): Future[CreateFlowLogsResult] = ???

  override def createFpgaImageAsync(createFpgaImageRequest: CreateFpgaImageRequest): Future[CreateFpgaImageResult] = ???

  override def createFpgaImageAsync(createFpgaImageRequest: CreateFpgaImageRequest, asyncHandler: AsyncHandler[CreateFpgaImageRequest, CreateFpgaImageResult]): Future[CreateFpgaImageResult] = ???

  override def createImageAsync(createImageRequest: CreateImageRequest): Future[CreateImageResult] = ???

  override def createImageAsync(createImageRequest: CreateImageRequest, asyncHandler: AsyncHandler[CreateImageRequest, CreateImageResult]): Future[CreateImageResult] = ???

  override def createInstanceExportTaskAsync(createInstanceExportTaskRequest: CreateInstanceExportTaskRequest): Future[CreateInstanceExportTaskResult] = ???

  override def createInstanceExportTaskAsync(createInstanceExportTaskRequest: CreateInstanceExportTaskRequest, asyncHandler: AsyncHandler[CreateInstanceExportTaskRequest, CreateInstanceExportTaskResult]): Future[CreateInstanceExportTaskResult] = ???

  override def createInternetGatewayAsync(createInternetGatewayRequest: CreateInternetGatewayRequest): Future[CreateInternetGatewayResult] = ???

  override def createInternetGatewayAsync(createInternetGatewayRequest: CreateInternetGatewayRequest, asyncHandler: AsyncHandler[CreateInternetGatewayRequest, CreateInternetGatewayResult]): Future[CreateInternetGatewayResult] = ???

  override def createInternetGatewayAsync(): Future[CreateInternetGatewayResult] = ???

  override def createInternetGatewayAsync(asyncHandler: AsyncHandler[CreateInternetGatewayRequest, CreateInternetGatewayResult]): Future[CreateInternetGatewayResult] = ???

  override def createKeyPairAsync(createKeyPairRequest: CreateKeyPairRequest): Future[CreateKeyPairResult] = ???

  override def createKeyPairAsync(createKeyPairRequest: CreateKeyPairRequest, asyncHandler: AsyncHandler[CreateKeyPairRequest, CreateKeyPairResult]): Future[CreateKeyPairResult] = ???

  override def createLaunchTemplateAsync(createLaunchTemplateRequest: CreateLaunchTemplateRequest): Future[CreateLaunchTemplateResult] = ???

  override def createLaunchTemplateAsync(createLaunchTemplateRequest: CreateLaunchTemplateRequest, asyncHandler: AsyncHandler[CreateLaunchTemplateRequest, CreateLaunchTemplateResult]): Future[CreateLaunchTemplateResult] = ???

  override def createLaunchTemplateVersionAsync(createLaunchTemplateVersionRequest: CreateLaunchTemplateVersionRequest): Future[CreateLaunchTemplateVersionResult] = ???

  override def createLaunchTemplateVersionAsync(createLaunchTemplateVersionRequest: CreateLaunchTemplateVersionRequest, asyncHandler: AsyncHandler[CreateLaunchTemplateVersionRequest, CreateLaunchTemplateVersionResult]): Future[CreateLaunchTemplateVersionResult] = ???

  override def createNatGatewayAsync(createNatGatewayRequest: CreateNatGatewayRequest): Future[CreateNatGatewayResult] = ???

  override def createNatGatewayAsync(createNatGatewayRequest: CreateNatGatewayRequest, asyncHandler: AsyncHandler[CreateNatGatewayRequest, CreateNatGatewayResult]): Future[CreateNatGatewayResult] = ???

  override def createNetworkAclAsync(createNetworkAclRequest: CreateNetworkAclRequest): Future[CreateNetworkAclResult] = ???

  override def createNetworkAclAsync(createNetworkAclRequest: CreateNetworkAclRequest, asyncHandler: AsyncHandler[CreateNetworkAclRequest, CreateNetworkAclResult]): Future[CreateNetworkAclResult] = ???

  override def createNetworkAclEntryAsync(createNetworkAclEntryRequest: CreateNetworkAclEntryRequest): Future[CreateNetworkAclEntryResult] = ???

  override def createNetworkAclEntryAsync(createNetworkAclEntryRequest: CreateNetworkAclEntryRequest, asyncHandler: AsyncHandler[CreateNetworkAclEntryRequest, CreateNetworkAclEntryResult]): Future[CreateNetworkAclEntryResult] = ???

  override def createNetworkInterfaceAsync(createNetworkInterfaceRequest: CreateNetworkInterfaceRequest): Future[CreateNetworkInterfaceResult] = ???

  override def createNetworkInterfaceAsync(createNetworkInterfaceRequest: CreateNetworkInterfaceRequest, asyncHandler: AsyncHandler[CreateNetworkInterfaceRequest, CreateNetworkInterfaceResult]): Future[CreateNetworkInterfaceResult] = ???

  override def createNetworkInterfacePermissionAsync(createNetworkInterfacePermissionRequest: CreateNetworkInterfacePermissionRequest): Future[CreateNetworkInterfacePermissionResult] = ???

  override def createNetworkInterfacePermissionAsync(createNetworkInterfacePermissionRequest: CreateNetworkInterfacePermissionRequest, asyncHandler: AsyncHandler[CreateNetworkInterfacePermissionRequest, CreateNetworkInterfacePermissionResult]): Future[CreateNetworkInterfacePermissionResult] = ???

  override def createPlacementGroupAsync(createPlacementGroupRequest: CreatePlacementGroupRequest): Future[CreatePlacementGroupResult] = ???

  override def createPlacementGroupAsync(createPlacementGroupRequest: CreatePlacementGroupRequest, asyncHandler: AsyncHandler[CreatePlacementGroupRequest, CreatePlacementGroupResult]): Future[CreatePlacementGroupResult] = ???

  override def createReservedInstancesListingAsync(createReservedInstancesListingRequest: CreateReservedInstancesListingRequest): Future[CreateReservedInstancesListingResult] = ???

  override def createReservedInstancesListingAsync(createReservedInstancesListingRequest: CreateReservedInstancesListingRequest, asyncHandler: AsyncHandler[CreateReservedInstancesListingRequest, CreateReservedInstancesListingResult]): Future[CreateReservedInstancesListingResult] = ???

  override def createRouteAsync(createRouteRequest: CreateRouteRequest): Future[CreateRouteResult] = ???

  override def createRouteAsync(createRouteRequest: CreateRouteRequest, asyncHandler: AsyncHandler[CreateRouteRequest, CreateRouteResult]): Future[CreateRouteResult] = ???

  override def createRouteTableAsync(createRouteTableRequest: CreateRouteTableRequest): Future[CreateRouteTableResult] = ???

  override def createRouteTableAsync(createRouteTableRequest: CreateRouteTableRequest, asyncHandler: AsyncHandler[CreateRouteTableRequest, CreateRouteTableResult]): Future[CreateRouteTableResult] = ???

  override def createSecurityGroupAsync(createSecurityGroupRequest: CreateSecurityGroupRequest): Future[CreateSecurityGroupResult] = ???

  override def createSecurityGroupAsync(createSecurityGroupRequest: CreateSecurityGroupRequest, asyncHandler: AsyncHandler[CreateSecurityGroupRequest, CreateSecurityGroupResult]): Future[CreateSecurityGroupResult] = ???

  override def createSnapshotAsync(createSnapshotRequest: CreateSnapshotRequest): Future[CreateSnapshotResult] = ???

  override def createSnapshotAsync(createSnapshotRequest: CreateSnapshotRequest, asyncHandler: AsyncHandler[CreateSnapshotRequest, CreateSnapshotResult]): Future[CreateSnapshotResult] = ???

  override def createSpotDatafeedSubscriptionAsync(createSpotDatafeedSubscriptionRequest: CreateSpotDatafeedSubscriptionRequest): Future[CreateSpotDatafeedSubscriptionResult] = ???

  override def createSpotDatafeedSubscriptionAsync(createSpotDatafeedSubscriptionRequest: CreateSpotDatafeedSubscriptionRequest, asyncHandler: AsyncHandler[CreateSpotDatafeedSubscriptionRequest, CreateSpotDatafeedSubscriptionResult]): Future[CreateSpotDatafeedSubscriptionResult] = ???

  override def createSubnetAsync(createSubnetRequest: CreateSubnetRequest): Future[CreateSubnetResult] = ???

  override def createSubnetAsync(createSubnetRequest: CreateSubnetRequest, asyncHandler: AsyncHandler[CreateSubnetRequest, CreateSubnetResult]): Future[CreateSubnetResult] = ???

  override def createTagsAsync(createTagsRequest: CreateTagsRequest): Future[CreateTagsResult] = ???

  override def createTagsAsync(createTagsRequest: CreateTagsRequest, asyncHandler: AsyncHandler[CreateTagsRequest, CreateTagsResult]): Future[CreateTagsResult] = ???

  override def createVolumeAsync(createVolumeRequest: CreateVolumeRequest): Future[CreateVolumeResult] = ???

  override def createVolumeAsync(createVolumeRequest: CreateVolumeRequest, asyncHandler: AsyncHandler[CreateVolumeRequest, CreateVolumeResult]): Future[CreateVolumeResult] = ???

  override def createVpcAsync(createVpcRequest: CreateVpcRequest): Future[CreateVpcResult] = ???

  override def createVpcAsync(createVpcRequest: CreateVpcRequest, asyncHandler: AsyncHandler[CreateVpcRequest, CreateVpcResult]): Future[CreateVpcResult] = ???

  override def createVpcEndpointAsync(createVpcEndpointRequest: CreateVpcEndpointRequest): Future[CreateVpcEndpointResult] = ???

  override def createVpcEndpointAsync(createVpcEndpointRequest: CreateVpcEndpointRequest, asyncHandler: AsyncHandler[CreateVpcEndpointRequest, CreateVpcEndpointResult]): Future[CreateVpcEndpointResult] = ???

  override def createVpcEndpointConnectionNotificationAsync(createVpcEndpointConnectionNotificationRequest: CreateVpcEndpointConnectionNotificationRequest): Future[CreateVpcEndpointConnectionNotificationResult] = ???

  override def createVpcEndpointConnectionNotificationAsync(createVpcEndpointConnectionNotificationRequest: CreateVpcEndpointConnectionNotificationRequest, asyncHandler: AsyncHandler[CreateVpcEndpointConnectionNotificationRequest, CreateVpcEndpointConnectionNotificationResult]): Future[CreateVpcEndpointConnectionNotificationResult] = ???

  override def createVpcEndpointServiceConfigurationAsync(createVpcEndpointServiceConfigurationRequest: CreateVpcEndpointServiceConfigurationRequest): Future[CreateVpcEndpointServiceConfigurationResult] = ???

  override def createVpcEndpointServiceConfigurationAsync(createVpcEndpointServiceConfigurationRequest: CreateVpcEndpointServiceConfigurationRequest, asyncHandler: AsyncHandler[CreateVpcEndpointServiceConfigurationRequest, CreateVpcEndpointServiceConfigurationResult]): Future[CreateVpcEndpointServiceConfigurationResult] = ???

  override def createVpcPeeringConnectionAsync(createVpcPeeringConnectionRequest: CreateVpcPeeringConnectionRequest): Future[CreateVpcPeeringConnectionResult] = ???

  override def createVpcPeeringConnectionAsync(createVpcPeeringConnectionRequest: CreateVpcPeeringConnectionRequest, asyncHandler: AsyncHandler[CreateVpcPeeringConnectionRequest, CreateVpcPeeringConnectionResult]): Future[CreateVpcPeeringConnectionResult] = ???

  override def createVpcPeeringConnectionAsync(): Future[CreateVpcPeeringConnectionResult] = ???

  override def createVpcPeeringConnectionAsync(asyncHandler: AsyncHandler[CreateVpcPeeringConnectionRequest, CreateVpcPeeringConnectionResult]): Future[CreateVpcPeeringConnectionResult] = ???

  override def createVpnConnectionAsync(createVpnConnectionRequest: CreateVpnConnectionRequest): Future[CreateVpnConnectionResult] = ???

  override def createVpnConnectionAsync(createVpnConnectionRequest: CreateVpnConnectionRequest, asyncHandler: AsyncHandler[CreateVpnConnectionRequest, CreateVpnConnectionResult]): Future[CreateVpnConnectionResult] = ???

  override def createVpnConnectionRouteAsync(createVpnConnectionRouteRequest: CreateVpnConnectionRouteRequest): Future[CreateVpnConnectionRouteResult] = ???

  override def createVpnConnectionRouteAsync(createVpnConnectionRouteRequest: CreateVpnConnectionRouteRequest, asyncHandler: AsyncHandler[CreateVpnConnectionRouteRequest, CreateVpnConnectionRouteResult]): Future[CreateVpnConnectionRouteResult] = ???

  override def createVpnGatewayAsync(createVpnGatewayRequest: CreateVpnGatewayRequest): Future[CreateVpnGatewayResult] = ???

  override def createVpnGatewayAsync(createVpnGatewayRequest: CreateVpnGatewayRequest, asyncHandler: AsyncHandler[CreateVpnGatewayRequest, CreateVpnGatewayResult]): Future[CreateVpnGatewayResult] = ???

  override def deleteCustomerGatewayAsync(deleteCustomerGatewayRequest: DeleteCustomerGatewayRequest): Future[DeleteCustomerGatewayResult] = ???

  override def deleteCustomerGatewayAsync(deleteCustomerGatewayRequest: DeleteCustomerGatewayRequest, asyncHandler: AsyncHandler[DeleteCustomerGatewayRequest, DeleteCustomerGatewayResult]): Future[DeleteCustomerGatewayResult] = ???

  override def deleteDhcpOptionsAsync(deleteDhcpOptionsRequest: DeleteDhcpOptionsRequest): Future[DeleteDhcpOptionsResult] = ???

  override def deleteDhcpOptionsAsync(deleteDhcpOptionsRequest: DeleteDhcpOptionsRequest, asyncHandler: AsyncHandler[DeleteDhcpOptionsRequest, DeleteDhcpOptionsResult]): Future[DeleteDhcpOptionsResult] = ???

  override def deleteEgressOnlyInternetGatewayAsync(deleteEgressOnlyInternetGatewayRequest: DeleteEgressOnlyInternetGatewayRequest): Future[DeleteEgressOnlyInternetGatewayResult] = ???

  override def deleteEgressOnlyInternetGatewayAsync(deleteEgressOnlyInternetGatewayRequest: DeleteEgressOnlyInternetGatewayRequest, asyncHandler: AsyncHandler[DeleteEgressOnlyInternetGatewayRequest, DeleteEgressOnlyInternetGatewayResult]): Future[DeleteEgressOnlyInternetGatewayResult] = ???

  override def deleteFleetsAsync(deleteFleetsRequest: DeleteFleetsRequest): Future[DeleteFleetsResult] = ???

  override def deleteFleetsAsync(deleteFleetsRequest: DeleteFleetsRequest, asyncHandler: AsyncHandler[DeleteFleetsRequest, DeleteFleetsResult]): Future[DeleteFleetsResult] = ???

  override def deleteFlowLogsAsync(deleteFlowLogsRequest: DeleteFlowLogsRequest): Future[DeleteFlowLogsResult] = ???

  override def deleteFlowLogsAsync(deleteFlowLogsRequest: DeleteFlowLogsRequest, asyncHandler: AsyncHandler[DeleteFlowLogsRequest, DeleteFlowLogsResult]): Future[DeleteFlowLogsResult] = ???

  override def deleteFpgaImageAsync(deleteFpgaImageRequest: DeleteFpgaImageRequest): Future[DeleteFpgaImageResult] = ???

  override def deleteFpgaImageAsync(deleteFpgaImageRequest: DeleteFpgaImageRequest, asyncHandler: AsyncHandler[DeleteFpgaImageRequest, DeleteFpgaImageResult]): Future[DeleteFpgaImageResult] = ???

  override def deleteInternetGatewayAsync(deleteInternetGatewayRequest: DeleteInternetGatewayRequest): Future[DeleteInternetGatewayResult] = ???

  override def deleteInternetGatewayAsync(deleteInternetGatewayRequest: DeleteInternetGatewayRequest, asyncHandler: AsyncHandler[DeleteInternetGatewayRequest, DeleteInternetGatewayResult]): Future[DeleteInternetGatewayResult] = ???

  override def deleteKeyPairAsync(deleteKeyPairRequest: DeleteKeyPairRequest): Future[DeleteKeyPairResult] = ???

  override def deleteKeyPairAsync(deleteKeyPairRequest: DeleteKeyPairRequest, asyncHandler: AsyncHandler[DeleteKeyPairRequest, DeleteKeyPairResult]): Future[DeleteKeyPairResult] = ???

  override def deleteLaunchTemplateAsync(deleteLaunchTemplateRequest: DeleteLaunchTemplateRequest): Future[DeleteLaunchTemplateResult] = ???

  override def deleteLaunchTemplateAsync(deleteLaunchTemplateRequest: DeleteLaunchTemplateRequest, asyncHandler: AsyncHandler[DeleteLaunchTemplateRequest, DeleteLaunchTemplateResult]): Future[DeleteLaunchTemplateResult] = ???

  override def deleteLaunchTemplateVersionsAsync(deleteLaunchTemplateVersionsRequest: DeleteLaunchTemplateVersionsRequest): Future[DeleteLaunchTemplateVersionsResult] = ???

  override def deleteLaunchTemplateVersionsAsync(deleteLaunchTemplateVersionsRequest: DeleteLaunchTemplateVersionsRequest, asyncHandler: AsyncHandler[DeleteLaunchTemplateVersionsRequest, DeleteLaunchTemplateVersionsResult]): Future[DeleteLaunchTemplateVersionsResult] = ???

  override def deleteNatGatewayAsync(deleteNatGatewayRequest: DeleteNatGatewayRequest): Future[DeleteNatGatewayResult] = ???

  override def deleteNatGatewayAsync(deleteNatGatewayRequest: DeleteNatGatewayRequest, asyncHandler: AsyncHandler[DeleteNatGatewayRequest, DeleteNatGatewayResult]): Future[DeleteNatGatewayResult] = ???

  override def deleteNetworkAclAsync(deleteNetworkAclRequest: DeleteNetworkAclRequest): Future[DeleteNetworkAclResult] = ???

  override def deleteNetworkAclAsync(deleteNetworkAclRequest: DeleteNetworkAclRequest, asyncHandler: AsyncHandler[DeleteNetworkAclRequest, DeleteNetworkAclResult]): Future[DeleteNetworkAclResult] = ???

  override def deleteNetworkAclEntryAsync(deleteNetworkAclEntryRequest: DeleteNetworkAclEntryRequest): Future[DeleteNetworkAclEntryResult] = ???

  override def deleteNetworkAclEntryAsync(deleteNetworkAclEntryRequest: DeleteNetworkAclEntryRequest, asyncHandler: AsyncHandler[DeleteNetworkAclEntryRequest, DeleteNetworkAclEntryResult]): Future[DeleteNetworkAclEntryResult] = ???

  override def deleteNetworkInterfaceAsync(deleteNetworkInterfaceRequest: DeleteNetworkInterfaceRequest): Future[DeleteNetworkInterfaceResult] = ???

  override def deleteNetworkInterfaceAsync(deleteNetworkInterfaceRequest: DeleteNetworkInterfaceRequest, asyncHandler: AsyncHandler[DeleteNetworkInterfaceRequest, DeleteNetworkInterfaceResult]): Future[DeleteNetworkInterfaceResult] = ???

  override def deleteNetworkInterfacePermissionAsync(deleteNetworkInterfacePermissionRequest: DeleteNetworkInterfacePermissionRequest): Future[DeleteNetworkInterfacePermissionResult] = ???

  override def deleteNetworkInterfacePermissionAsync(deleteNetworkInterfacePermissionRequest: DeleteNetworkInterfacePermissionRequest, asyncHandler: AsyncHandler[DeleteNetworkInterfacePermissionRequest, DeleteNetworkInterfacePermissionResult]): Future[DeleteNetworkInterfacePermissionResult] = ???

  override def deletePlacementGroupAsync(deletePlacementGroupRequest: DeletePlacementGroupRequest): Future[DeletePlacementGroupResult] = ???

  override def deletePlacementGroupAsync(deletePlacementGroupRequest: DeletePlacementGroupRequest, asyncHandler: AsyncHandler[DeletePlacementGroupRequest, DeletePlacementGroupResult]): Future[DeletePlacementGroupResult] = ???

  override def deleteRouteAsync(deleteRouteRequest: DeleteRouteRequest): Future[DeleteRouteResult] = ???

  override def deleteRouteAsync(deleteRouteRequest: DeleteRouteRequest, asyncHandler: AsyncHandler[DeleteRouteRequest, DeleteRouteResult]): Future[DeleteRouteResult] = ???

  override def deleteRouteTableAsync(deleteRouteTableRequest: DeleteRouteTableRequest): Future[DeleteRouteTableResult] = ???

  override def deleteRouteTableAsync(deleteRouteTableRequest: DeleteRouteTableRequest, asyncHandler: AsyncHandler[DeleteRouteTableRequest, DeleteRouteTableResult]): Future[DeleteRouteTableResult] = ???

  override def deleteSecurityGroupAsync(deleteSecurityGroupRequest: DeleteSecurityGroupRequest): Future[DeleteSecurityGroupResult] = ???

  override def deleteSecurityGroupAsync(deleteSecurityGroupRequest: DeleteSecurityGroupRequest, asyncHandler: AsyncHandler[DeleteSecurityGroupRequest, DeleteSecurityGroupResult]): Future[DeleteSecurityGroupResult] = ???

  override def deleteSnapshotAsync(deleteSnapshotRequest: DeleteSnapshotRequest): Future[DeleteSnapshotResult] = ???

  override def deleteSnapshotAsync(deleteSnapshotRequest: DeleteSnapshotRequest, asyncHandler: AsyncHandler[DeleteSnapshotRequest, DeleteSnapshotResult]): Future[DeleteSnapshotResult] = ???

  override def deleteSpotDatafeedSubscriptionAsync(deleteSpotDatafeedSubscriptionRequest: DeleteSpotDatafeedSubscriptionRequest): Future[DeleteSpotDatafeedSubscriptionResult] = ???

  override def deleteSpotDatafeedSubscriptionAsync(deleteSpotDatafeedSubscriptionRequest: DeleteSpotDatafeedSubscriptionRequest, asyncHandler: AsyncHandler[DeleteSpotDatafeedSubscriptionRequest, DeleteSpotDatafeedSubscriptionResult]): Future[DeleteSpotDatafeedSubscriptionResult] = ???

  override def deleteSpotDatafeedSubscriptionAsync(): Future[DeleteSpotDatafeedSubscriptionResult] = ???

  override def deleteSpotDatafeedSubscriptionAsync(asyncHandler: AsyncHandler[DeleteSpotDatafeedSubscriptionRequest, DeleteSpotDatafeedSubscriptionResult]): Future[DeleteSpotDatafeedSubscriptionResult] = ???

  override def deleteSubnetAsync(deleteSubnetRequest: DeleteSubnetRequest): Future[DeleteSubnetResult] = ???

  override def deleteSubnetAsync(deleteSubnetRequest: DeleteSubnetRequest, asyncHandler: AsyncHandler[DeleteSubnetRequest, DeleteSubnetResult]): Future[DeleteSubnetResult] = ???

  override def deleteTagsAsync(deleteTagsRequest: DeleteTagsRequest): Future[DeleteTagsResult] = ???

  override def deleteTagsAsync(deleteTagsRequest: DeleteTagsRequest, asyncHandler: AsyncHandler[DeleteTagsRequest, DeleteTagsResult]): Future[DeleteTagsResult] = ???

  override def deleteVolumeAsync(deleteVolumeRequest: DeleteVolumeRequest): Future[DeleteVolumeResult] = ???

  override def deleteVolumeAsync(deleteVolumeRequest: DeleteVolumeRequest, asyncHandler: AsyncHandler[DeleteVolumeRequest, DeleteVolumeResult]): Future[DeleteVolumeResult] = ???

  override def deleteVpcAsync(deleteVpcRequest: DeleteVpcRequest): Future[DeleteVpcResult] = ???

  override def deleteVpcAsync(deleteVpcRequest: DeleteVpcRequest, asyncHandler: AsyncHandler[DeleteVpcRequest, DeleteVpcResult]): Future[DeleteVpcResult] = ???

  override def deleteVpcEndpointConnectionNotificationsAsync(deleteVpcEndpointConnectionNotificationsRequest: DeleteVpcEndpointConnectionNotificationsRequest): Future[DeleteVpcEndpointConnectionNotificationsResult] = ???

  override def deleteVpcEndpointConnectionNotificationsAsync(deleteVpcEndpointConnectionNotificationsRequest: DeleteVpcEndpointConnectionNotificationsRequest, asyncHandler: AsyncHandler[DeleteVpcEndpointConnectionNotificationsRequest, DeleteVpcEndpointConnectionNotificationsResult]): Future[DeleteVpcEndpointConnectionNotificationsResult] = ???

  override def deleteVpcEndpointServiceConfigurationsAsync(deleteVpcEndpointServiceConfigurationsRequest: DeleteVpcEndpointServiceConfigurationsRequest): Future[DeleteVpcEndpointServiceConfigurationsResult] = ???

  override def deleteVpcEndpointServiceConfigurationsAsync(deleteVpcEndpointServiceConfigurationsRequest: DeleteVpcEndpointServiceConfigurationsRequest, asyncHandler: AsyncHandler[DeleteVpcEndpointServiceConfigurationsRequest, DeleteVpcEndpointServiceConfigurationsResult]): Future[DeleteVpcEndpointServiceConfigurationsResult] = ???

  override def deleteVpcEndpointsAsync(deleteVpcEndpointsRequest: DeleteVpcEndpointsRequest): Future[DeleteVpcEndpointsResult] = ???

  override def deleteVpcEndpointsAsync(deleteVpcEndpointsRequest: DeleteVpcEndpointsRequest, asyncHandler: AsyncHandler[DeleteVpcEndpointsRequest, DeleteVpcEndpointsResult]): Future[DeleteVpcEndpointsResult] = ???

  override def deleteVpcPeeringConnectionAsync(deleteVpcPeeringConnectionRequest: DeleteVpcPeeringConnectionRequest): Future[DeleteVpcPeeringConnectionResult] = ???

  override def deleteVpcPeeringConnectionAsync(deleteVpcPeeringConnectionRequest: DeleteVpcPeeringConnectionRequest, asyncHandler: AsyncHandler[DeleteVpcPeeringConnectionRequest, DeleteVpcPeeringConnectionResult]): Future[DeleteVpcPeeringConnectionResult] = ???

  override def deleteVpnConnectionAsync(deleteVpnConnectionRequest: DeleteVpnConnectionRequest): Future[DeleteVpnConnectionResult] = ???

  override def deleteVpnConnectionAsync(deleteVpnConnectionRequest: DeleteVpnConnectionRequest, asyncHandler: AsyncHandler[DeleteVpnConnectionRequest, DeleteVpnConnectionResult]): Future[DeleteVpnConnectionResult] = ???

  override def deleteVpnConnectionRouteAsync(deleteVpnConnectionRouteRequest: DeleteVpnConnectionRouteRequest): Future[DeleteVpnConnectionRouteResult] = ???

  override def deleteVpnConnectionRouteAsync(deleteVpnConnectionRouteRequest: DeleteVpnConnectionRouteRequest, asyncHandler: AsyncHandler[DeleteVpnConnectionRouteRequest, DeleteVpnConnectionRouteResult]): Future[DeleteVpnConnectionRouteResult] = ???

  override def deleteVpnGatewayAsync(deleteVpnGatewayRequest: DeleteVpnGatewayRequest): Future[DeleteVpnGatewayResult] = ???

  override def deleteVpnGatewayAsync(deleteVpnGatewayRequest: DeleteVpnGatewayRequest, asyncHandler: AsyncHandler[DeleteVpnGatewayRequest, DeleteVpnGatewayResult]): Future[DeleteVpnGatewayResult] = ???

  override def deregisterImageAsync(deregisterImageRequest: DeregisterImageRequest): Future[DeregisterImageResult] = ???

  override def deregisterImageAsync(deregisterImageRequest: DeregisterImageRequest, asyncHandler: AsyncHandler[DeregisterImageRequest, DeregisterImageResult]): Future[DeregisterImageResult] = ???

  override def describeAccountAttributesAsync(describeAccountAttributesRequest: DescribeAccountAttributesRequest): Future[DescribeAccountAttributesResult] = ???

  override def describeAccountAttributesAsync(describeAccountAttributesRequest: DescribeAccountAttributesRequest, asyncHandler: AsyncHandler[DescribeAccountAttributesRequest, DescribeAccountAttributesResult]): Future[DescribeAccountAttributesResult] = ???

  override def describeAccountAttributesAsync(): Future[DescribeAccountAttributesResult] = ???

  override def describeAccountAttributesAsync(asyncHandler: AsyncHandler[DescribeAccountAttributesRequest, DescribeAccountAttributesResult]): Future[DescribeAccountAttributesResult] = ???

  override def describeAddressesAsync(describeAddressesRequest: DescribeAddressesRequest): Future[DescribeAddressesResult] = ???

  override def describeAddressesAsync(describeAddressesRequest: DescribeAddressesRequest, asyncHandler: AsyncHandler[DescribeAddressesRequest, DescribeAddressesResult]): Future[DescribeAddressesResult] = ???

  override def describeAddressesAsync(): Future[DescribeAddressesResult] = ???

  override def describeAddressesAsync(asyncHandler: AsyncHandler[DescribeAddressesRequest, DescribeAddressesResult]): Future[DescribeAddressesResult] = ???

  override def describeAggregateIdFormatAsync(describeAggregateIdFormatRequest: DescribeAggregateIdFormatRequest): Future[DescribeAggregateIdFormatResult] = ???

  override def describeAggregateIdFormatAsync(describeAggregateIdFormatRequest: DescribeAggregateIdFormatRequest, asyncHandler: AsyncHandler[DescribeAggregateIdFormatRequest, DescribeAggregateIdFormatResult]): Future[DescribeAggregateIdFormatResult] = ???

  override def describeAvailabilityZonesAsync(describeAvailabilityZonesRequest: DescribeAvailabilityZonesRequest): Future[DescribeAvailabilityZonesResult] = ???

  override def describeAvailabilityZonesAsync(describeAvailabilityZonesRequest: DescribeAvailabilityZonesRequest, asyncHandler: AsyncHandler[DescribeAvailabilityZonesRequest, DescribeAvailabilityZonesResult]): Future[DescribeAvailabilityZonesResult] = ???

  override def describeAvailabilityZonesAsync(): Future[DescribeAvailabilityZonesResult] = ???

  override def describeAvailabilityZonesAsync(asyncHandler: AsyncHandler[DescribeAvailabilityZonesRequest, DescribeAvailabilityZonesResult]): Future[DescribeAvailabilityZonesResult] = ???

  override def describeBundleTasksAsync(describeBundleTasksRequest: DescribeBundleTasksRequest): Future[DescribeBundleTasksResult] = ???

  override def describeBundleTasksAsync(describeBundleTasksRequest: DescribeBundleTasksRequest, asyncHandler: AsyncHandler[DescribeBundleTasksRequest, DescribeBundleTasksResult]): Future[DescribeBundleTasksResult] = ???

  override def describeBundleTasksAsync(): Future[DescribeBundleTasksResult] = ???

  override def describeBundleTasksAsync(asyncHandler: AsyncHandler[DescribeBundleTasksRequest, DescribeBundleTasksResult]): Future[DescribeBundleTasksResult] = ???

  override def describeClassicLinkInstancesAsync(describeClassicLinkInstancesRequest: DescribeClassicLinkInstancesRequest): Future[DescribeClassicLinkInstancesResult] = ???

  override def describeClassicLinkInstancesAsync(describeClassicLinkInstancesRequest: DescribeClassicLinkInstancesRequest, asyncHandler: AsyncHandler[DescribeClassicLinkInstancesRequest, DescribeClassicLinkInstancesResult]): Future[DescribeClassicLinkInstancesResult] = ???

  override def describeClassicLinkInstancesAsync(): Future[DescribeClassicLinkInstancesResult] = ???

  override def describeClassicLinkInstancesAsync(asyncHandler: AsyncHandler[DescribeClassicLinkInstancesRequest, DescribeClassicLinkInstancesResult]): Future[DescribeClassicLinkInstancesResult] = ???

  override def describeConversionTasksAsync(describeConversionTasksRequest: DescribeConversionTasksRequest): Future[DescribeConversionTasksResult] = ???

  override def describeConversionTasksAsync(describeConversionTasksRequest: DescribeConversionTasksRequest, asyncHandler: AsyncHandler[DescribeConversionTasksRequest, DescribeConversionTasksResult]): Future[DescribeConversionTasksResult] = ???

  override def describeConversionTasksAsync(): Future[DescribeConversionTasksResult] = ???

  override def describeConversionTasksAsync(asyncHandler: AsyncHandler[DescribeConversionTasksRequest, DescribeConversionTasksResult]): Future[DescribeConversionTasksResult] = ???

  override def describeCustomerGatewaysAsync(describeCustomerGatewaysRequest: DescribeCustomerGatewaysRequest): Future[DescribeCustomerGatewaysResult] = ???

  override def describeCustomerGatewaysAsync(describeCustomerGatewaysRequest: DescribeCustomerGatewaysRequest, asyncHandler: AsyncHandler[DescribeCustomerGatewaysRequest, DescribeCustomerGatewaysResult]): Future[DescribeCustomerGatewaysResult] = ???

  override def describeCustomerGatewaysAsync(): Future[DescribeCustomerGatewaysResult] = ???

  override def describeCustomerGatewaysAsync(asyncHandler: AsyncHandler[DescribeCustomerGatewaysRequest, DescribeCustomerGatewaysResult]): Future[DescribeCustomerGatewaysResult] = ???

  override def describeDhcpOptionsAsync(describeDhcpOptionsRequest: DescribeDhcpOptionsRequest): Future[DescribeDhcpOptionsResult] = ???

  override def describeDhcpOptionsAsync(describeDhcpOptionsRequest: DescribeDhcpOptionsRequest, asyncHandler: AsyncHandler[DescribeDhcpOptionsRequest, DescribeDhcpOptionsResult]): Future[DescribeDhcpOptionsResult] = ???

  override def describeDhcpOptionsAsync(): Future[DescribeDhcpOptionsResult] = ???

  override def describeDhcpOptionsAsync(asyncHandler: AsyncHandler[DescribeDhcpOptionsRequest, DescribeDhcpOptionsResult]): Future[DescribeDhcpOptionsResult] = ???

  override def describeEgressOnlyInternetGatewaysAsync(describeEgressOnlyInternetGatewaysRequest: DescribeEgressOnlyInternetGatewaysRequest): Future[DescribeEgressOnlyInternetGatewaysResult] = ???

  override def describeEgressOnlyInternetGatewaysAsync(describeEgressOnlyInternetGatewaysRequest: DescribeEgressOnlyInternetGatewaysRequest, asyncHandler: AsyncHandler[DescribeEgressOnlyInternetGatewaysRequest, DescribeEgressOnlyInternetGatewaysResult]): Future[DescribeEgressOnlyInternetGatewaysResult] = ???

  override def describeElasticGpusAsync(describeElasticGpusRequest: DescribeElasticGpusRequest): Future[DescribeElasticGpusResult] = ???

  override def describeElasticGpusAsync(describeElasticGpusRequest: DescribeElasticGpusRequest, asyncHandler: AsyncHandler[DescribeElasticGpusRequest, DescribeElasticGpusResult]): Future[DescribeElasticGpusResult] = ???

  override def describeExportTasksAsync(describeExportTasksRequest: DescribeExportTasksRequest): Future[DescribeExportTasksResult] = ???

  override def describeExportTasksAsync(describeExportTasksRequest: DescribeExportTasksRequest, asyncHandler: AsyncHandler[DescribeExportTasksRequest, DescribeExportTasksResult]): Future[DescribeExportTasksResult] = ???

  override def describeExportTasksAsync(): Future[DescribeExportTasksResult] = ???

  override def describeExportTasksAsync(asyncHandler: AsyncHandler[DescribeExportTasksRequest, DescribeExportTasksResult]): Future[DescribeExportTasksResult] = ???

  override def describeFleetHistoryAsync(describeFleetHistoryRequest: DescribeFleetHistoryRequest): Future[DescribeFleetHistoryResult] = ???

  override def describeFleetHistoryAsync(describeFleetHistoryRequest: DescribeFleetHistoryRequest, asyncHandler: AsyncHandler[DescribeFleetHistoryRequest, DescribeFleetHistoryResult]): Future[DescribeFleetHistoryResult] = ???

  override def describeFleetInstancesAsync(describeFleetInstancesRequest: DescribeFleetInstancesRequest): Future[DescribeFleetInstancesResult] = ???

  override def describeFleetInstancesAsync(describeFleetInstancesRequest: DescribeFleetInstancesRequest, asyncHandler: AsyncHandler[DescribeFleetInstancesRequest, DescribeFleetInstancesResult]): Future[DescribeFleetInstancesResult] = ???

  override def describeFleetsAsync(describeFleetsRequest: DescribeFleetsRequest): Future[DescribeFleetsResult] = ???

  override def describeFleetsAsync(describeFleetsRequest: DescribeFleetsRequest, asyncHandler: AsyncHandler[DescribeFleetsRequest, DescribeFleetsResult]): Future[DescribeFleetsResult] = ???

  override def describeFlowLogsAsync(describeFlowLogsRequest: DescribeFlowLogsRequest): Future[DescribeFlowLogsResult] = ???

  override def describeFlowLogsAsync(describeFlowLogsRequest: DescribeFlowLogsRequest, asyncHandler: AsyncHandler[DescribeFlowLogsRequest, DescribeFlowLogsResult]): Future[DescribeFlowLogsResult] = ???

  override def describeFlowLogsAsync(): Future[DescribeFlowLogsResult] = ???

  override def describeFlowLogsAsync(asyncHandler: AsyncHandler[DescribeFlowLogsRequest, DescribeFlowLogsResult]): Future[DescribeFlowLogsResult] = ???

  override def describeFpgaImageAttributeAsync(describeFpgaImageAttributeRequest: DescribeFpgaImageAttributeRequest): Future[DescribeFpgaImageAttributeResult] = ???

  override def describeFpgaImageAttributeAsync(describeFpgaImageAttributeRequest: DescribeFpgaImageAttributeRequest, asyncHandler: AsyncHandler[DescribeFpgaImageAttributeRequest, DescribeFpgaImageAttributeResult]): Future[DescribeFpgaImageAttributeResult] = ???

  override def describeFpgaImagesAsync(describeFpgaImagesRequest: DescribeFpgaImagesRequest): Future[DescribeFpgaImagesResult] = ???

  override def describeFpgaImagesAsync(describeFpgaImagesRequest: DescribeFpgaImagesRequest, asyncHandler: AsyncHandler[DescribeFpgaImagesRequest, DescribeFpgaImagesResult]): Future[DescribeFpgaImagesResult] = ???

  override def describeHostReservationOfferingsAsync(describeHostReservationOfferingsRequest: DescribeHostReservationOfferingsRequest): Future[DescribeHostReservationOfferingsResult] = ???

  override def describeHostReservationOfferingsAsync(describeHostReservationOfferingsRequest: DescribeHostReservationOfferingsRequest, asyncHandler: AsyncHandler[DescribeHostReservationOfferingsRequest, DescribeHostReservationOfferingsResult]): Future[DescribeHostReservationOfferingsResult] = ???

  override def describeHostReservationsAsync(describeHostReservationsRequest: DescribeHostReservationsRequest): Future[DescribeHostReservationsResult] = ???

  override def describeHostReservationsAsync(describeHostReservationsRequest: DescribeHostReservationsRequest, asyncHandler: AsyncHandler[DescribeHostReservationsRequest, DescribeHostReservationsResult]): Future[DescribeHostReservationsResult] = ???

  override def describeHostsAsync(describeHostsRequest: DescribeHostsRequest): Future[DescribeHostsResult] = ???

  override def describeHostsAsync(describeHostsRequest: DescribeHostsRequest, asyncHandler: AsyncHandler[DescribeHostsRequest, DescribeHostsResult]): Future[DescribeHostsResult] = ???

  override def describeHostsAsync(): Future[DescribeHostsResult] = ???

  override def describeHostsAsync(asyncHandler: AsyncHandler[DescribeHostsRequest, DescribeHostsResult]): Future[DescribeHostsResult] = ???

  override def describeIamInstanceProfileAssociationsAsync(describeIamInstanceProfileAssociationsRequest: DescribeIamInstanceProfileAssociationsRequest): Future[DescribeIamInstanceProfileAssociationsResult] = ???

  override def describeIamInstanceProfileAssociationsAsync(describeIamInstanceProfileAssociationsRequest: DescribeIamInstanceProfileAssociationsRequest, asyncHandler: AsyncHandler[DescribeIamInstanceProfileAssociationsRequest, DescribeIamInstanceProfileAssociationsResult]): Future[DescribeIamInstanceProfileAssociationsResult] = ???

  override def describeIdFormatAsync(describeIdFormatRequest: DescribeIdFormatRequest): Future[DescribeIdFormatResult] = ???

  override def describeIdFormatAsync(describeIdFormatRequest: DescribeIdFormatRequest, asyncHandler: AsyncHandler[DescribeIdFormatRequest, DescribeIdFormatResult]): Future[DescribeIdFormatResult] = ???

  override def describeIdFormatAsync(): Future[DescribeIdFormatResult] = ???

  override def describeIdFormatAsync(asyncHandler: AsyncHandler[DescribeIdFormatRequest, DescribeIdFormatResult]): Future[DescribeIdFormatResult] = ???

  override def describeIdentityIdFormatAsync(describeIdentityIdFormatRequest: DescribeIdentityIdFormatRequest): Future[DescribeIdentityIdFormatResult] = ???

  override def describeIdentityIdFormatAsync(describeIdentityIdFormatRequest: DescribeIdentityIdFormatRequest, asyncHandler: AsyncHandler[DescribeIdentityIdFormatRequest, DescribeIdentityIdFormatResult]): Future[DescribeIdentityIdFormatResult] = ???

  override def describeImageAttributeAsync(describeImageAttributeRequest: DescribeImageAttributeRequest): Future[DescribeImageAttributeResult] = ???

  override def describeImageAttributeAsync(describeImageAttributeRequest: DescribeImageAttributeRequest, asyncHandler: AsyncHandler[DescribeImageAttributeRequest, DescribeImageAttributeResult]): Future[DescribeImageAttributeResult] = ???

  override def describeImagesAsync(describeImagesRequest: DescribeImagesRequest): Future[DescribeImagesResult] = ???

  override def describeImagesAsync(describeImagesRequest: DescribeImagesRequest, asyncHandler: AsyncHandler[DescribeImagesRequest, DescribeImagesResult]): Future[DescribeImagesResult] = ???

  override def describeImagesAsync(): Future[DescribeImagesResult] = ???

  override def describeImagesAsync(asyncHandler: AsyncHandler[DescribeImagesRequest, DescribeImagesResult]): Future[DescribeImagesResult] = ???

  override def describeImportImageTasksAsync(describeImportImageTasksRequest: DescribeImportImageTasksRequest): Future[DescribeImportImageTasksResult] = ???

  override def describeImportImageTasksAsync(describeImportImageTasksRequest: DescribeImportImageTasksRequest, asyncHandler: AsyncHandler[DescribeImportImageTasksRequest, DescribeImportImageTasksResult]): Future[DescribeImportImageTasksResult] = ???

  override def describeImportImageTasksAsync(): Future[DescribeImportImageTasksResult] = ???

  override def describeImportImageTasksAsync(asyncHandler: AsyncHandler[DescribeImportImageTasksRequest, DescribeImportImageTasksResult]): Future[DescribeImportImageTasksResult] = ???

  override def describeImportSnapshotTasksAsync(describeImportSnapshotTasksRequest: DescribeImportSnapshotTasksRequest): Future[DescribeImportSnapshotTasksResult] = ???

  override def describeImportSnapshotTasksAsync(describeImportSnapshotTasksRequest: DescribeImportSnapshotTasksRequest, asyncHandler: AsyncHandler[DescribeImportSnapshotTasksRequest, DescribeImportSnapshotTasksResult]): Future[DescribeImportSnapshotTasksResult] = ???

  override def describeImportSnapshotTasksAsync(): Future[DescribeImportSnapshotTasksResult] = ???

  override def describeImportSnapshotTasksAsync(asyncHandler: AsyncHandler[DescribeImportSnapshotTasksRequest, DescribeImportSnapshotTasksResult]): Future[DescribeImportSnapshotTasksResult] = ???

  override def describeInstanceAttributeAsync(describeInstanceAttributeRequest: DescribeInstanceAttributeRequest): Future[DescribeInstanceAttributeResult] = ???

  override def describeInstanceAttributeAsync(describeInstanceAttributeRequest: DescribeInstanceAttributeRequest, asyncHandler: AsyncHandler[DescribeInstanceAttributeRequest, DescribeInstanceAttributeResult]): Future[DescribeInstanceAttributeResult] = ???

  override def describeInstanceCreditSpecificationsAsync(describeInstanceCreditSpecificationsRequest: DescribeInstanceCreditSpecificationsRequest): Future[DescribeInstanceCreditSpecificationsResult] = ???

  override def describeInstanceCreditSpecificationsAsync(describeInstanceCreditSpecificationsRequest: DescribeInstanceCreditSpecificationsRequest, asyncHandler: AsyncHandler[DescribeInstanceCreditSpecificationsRequest, DescribeInstanceCreditSpecificationsResult]): Future[DescribeInstanceCreditSpecificationsResult] = ???

  override def describeInstanceStatusAsync(describeInstanceStatusRequest: DescribeInstanceStatusRequest): Future[DescribeInstanceStatusResult] = ???

  override def describeInstanceStatusAsync(describeInstanceStatusRequest: DescribeInstanceStatusRequest, asyncHandler: AsyncHandler[DescribeInstanceStatusRequest, DescribeInstanceStatusResult]): Future[DescribeInstanceStatusResult] = ???

  override def describeInstanceStatusAsync(): Future[DescribeInstanceStatusResult] = ???

  override def describeInstanceStatusAsync(asyncHandler: AsyncHandler[DescribeInstanceStatusRequest, DescribeInstanceStatusResult]): Future[DescribeInstanceStatusResult] = ???

  override def describeInstancesAsync(describeInstancesRequest: DescribeInstancesRequest): Future[DescribeInstancesResult] = ???

  override def describeInstancesAsync(describeInstancesRequest: DescribeInstancesRequest, asyncHandler: AsyncHandler[DescribeInstancesRequest, DescribeInstancesResult]): Future[DescribeInstancesResult] = ???

  override def describeInstancesAsync(): Future[DescribeInstancesResult] = ???

  override def describeInstancesAsync(asyncHandler: AsyncHandler[DescribeInstancesRequest, DescribeInstancesResult]): Future[DescribeInstancesResult] = ???

  override def describeInternetGatewaysAsync(describeInternetGatewaysRequest: DescribeInternetGatewaysRequest): Future[DescribeInternetGatewaysResult] = ???

  override def describeInternetGatewaysAsync(describeInternetGatewaysRequest: DescribeInternetGatewaysRequest, asyncHandler: AsyncHandler[DescribeInternetGatewaysRequest, DescribeInternetGatewaysResult]): Future[DescribeInternetGatewaysResult] = ???

  override def describeInternetGatewaysAsync(): Future[DescribeInternetGatewaysResult] = ???

  override def describeInternetGatewaysAsync(asyncHandler: AsyncHandler[DescribeInternetGatewaysRequest, DescribeInternetGatewaysResult]): Future[DescribeInternetGatewaysResult] = ???

  override def describeKeyPairsAsync(describeKeyPairsRequest: DescribeKeyPairsRequest): Future[DescribeKeyPairsResult] = ???

  override def describeKeyPairsAsync(describeKeyPairsRequest: DescribeKeyPairsRequest, asyncHandler: AsyncHandler[DescribeKeyPairsRequest, DescribeKeyPairsResult]): Future[DescribeKeyPairsResult] = ???

  override def describeKeyPairsAsync(): Future[DescribeKeyPairsResult] = ???

  override def describeKeyPairsAsync(asyncHandler: AsyncHandler[DescribeKeyPairsRequest, DescribeKeyPairsResult]): Future[DescribeKeyPairsResult] = ???

  override def describeLaunchTemplateVersionsAsync(describeLaunchTemplateVersionsRequest: DescribeLaunchTemplateVersionsRequest): Future[DescribeLaunchTemplateVersionsResult] = ???

  override def describeLaunchTemplateVersionsAsync(describeLaunchTemplateVersionsRequest: DescribeLaunchTemplateVersionsRequest, asyncHandler: AsyncHandler[DescribeLaunchTemplateVersionsRequest, DescribeLaunchTemplateVersionsResult]): Future[DescribeLaunchTemplateVersionsResult] = ???

  override def describeLaunchTemplatesAsync(describeLaunchTemplatesRequest: DescribeLaunchTemplatesRequest): Future[DescribeLaunchTemplatesResult] = ???

  override def describeLaunchTemplatesAsync(describeLaunchTemplatesRequest: DescribeLaunchTemplatesRequest, asyncHandler: AsyncHandler[DescribeLaunchTemplatesRequest, DescribeLaunchTemplatesResult]): Future[DescribeLaunchTemplatesResult] = ???

  override def describeMovingAddressesAsync(describeMovingAddressesRequest: DescribeMovingAddressesRequest): Future[DescribeMovingAddressesResult] = ???

  override def describeMovingAddressesAsync(describeMovingAddressesRequest: DescribeMovingAddressesRequest, asyncHandler: AsyncHandler[DescribeMovingAddressesRequest, DescribeMovingAddressesResult]): Future[DescribeMovingAddressesResult] = ???

  override def describeMovingAddressesAsync(): Future[DescribeMovingAddressesResult] = ???

  override def describeMovingAddressesAsync(asyncHandler: AsyncHandler[DescribeMovingAddressesRequest, DescribeMovingAddressesResult]): Future[DescribeMovingAddressesResult] = ???

  override def describeNatGatewaysAsync(describeNatGatewaysRequest: DescribeNatGatewaysRequest): Future[DescribeNatGatewaysResult] = ???

  override def describeNatGatewaysAsync(describeNatGatewaysRequest: DescribeNatGatewaysRequest, asyncHandler: AsyncHandler[DescribeNatGatewaysRequest, DescribeNatGatewaysResult]): Future[DescribeNatGatewaysResult] = ???

  override def describeNetworkAclsAsync(describeNetworkAclsRequest: DescribeNetworkAclsRequest): Future[DescribeNetworkAclsResult] = ???

  override def describeNetworkAclsAsync(describeNetworkAclsRequest: DescribeNetworkAclsRequest, asyncHandler: AsyncHandler[DescribeNetworkAclsRequest, DescribeNetworkAclsResult]): Future[DescribeNetworkAclsResult] = ???

  override def describeNetworkAclsAsync(): Future[DescribeNetworkAclsResult] = ???

  override def describeNetworkAclsAsync(asyncHandler: AsyncHandler[DescribeNetworkAclsRequest, DescribeNetworkAclsResult]): Future[DescribeNetworkAclsResult] = ???

  override def describeNetworkInterfaceAttributeAsync(describeNetworkInterfaceAttributeRequest: DescribeNetworkInterfaceAttributeRequest): Future[DescribeNetworkInterfaceAttributeResult] = ???

  override def describeNetworkInterfaceAttributeAsync(describeNetworkInterfaceAttributeRequest: DescribeNetworkInterfaceAttributeRequest, asyncHandler: AsyncHandler[DescribeNetworkInterfaceAttributeRequest, DescribeNetworkInterfaceAttributeResult]): Future[DescribeNetworkInterfaceAttributeResult] = ???

  override def describeNetworkInterfacePermissionsAsync(describeNetworkInterfacePermissionsRequest: DescribeNetworkInterfacePermissionsRequest): Future[DescribeNetworkInterfacePermissionsResult] = ???

  override def describeNetworkInterfacePermissionsAsync(describeNetworkInterfacePermissionsRequest: DescribeNetworkInterfacePermissionsRequest, asyncHandler: AsyncHandler[DescribeNetworkInterfacePermissionsRequest, DescribeNetworkInterfacePermissionsResult]): Future[DescribeNetworkInterfacePermissionsResult] = ???

  override def describeNetworkInterfacesAsync(describeNetworkInterfacesRequest: DescribeNetworkInterfacesRequest): Future[DescribeNetworkInterfacesResult] = ???

  override def describeNetworkInterfacesAsync(describeNetworkInterfacesRequest: DescribeNetworkInterfacesRequest, asyncHandler: AsyncHandler[DescribeNetworkInterfacesRequest, DescribeNetworkInterfacesResult]): Future[DescribeNetworkInterfacesResult] = ???

  override def describeNetworkInterfacesAsync(): Future[DescribeNetworkInterfacesResult] = ???

  override def describeNetworkInterfacesAsync(asyncHandler: AsyncHandler[DescribeNetworkInterfacesRequest, DescribeNetworkInterfacesResult]): Future[DescribeNetworkInterfacesResult] = ???

  override def describePlacementGroupsAsync(describePlacementGroupsRequest: DescribePlacementGroupsRequest): Future[DescribePlacementGroupsResult] = ???

  override def describePlacementGroupsAsync(describePlacementGroupsRequest: DescribePlacementGroupsRequest, asyncHandler: AsyncHandler[DescribePlacementGroupsRequest, DescribePlacementGroupsResult]): Future[DescribePlacementGroupsResult] = ???

  override def describePlacementGroupsAsync(): Future[DescribePlacementGroupsResult] = ???

  override def describePlacementGroupsAsync(asyncHandler: AsyncHandler[DescribePlacementGroupsRequest, DescribePlacementGroupsResult]): Future[DescribePlacementGroupsResult] = ???

  override def describePrefixListsAsync(describePrefixListsRequest: DescribePrefixListsRequest): Future[DescribePrefixListsResult] = ???

  override def describePrefixListsAsync(describePrefixListsRequest: DescribePrefixListsRequest, asyncHandler: AsyncHandler[DescribePrefixListsRequest, DescribePrefixListsResult]): Future[DescribePrefixListsResult] = ???

  override def describePrefixListsAsync(): Future[DescribePrefixListsResult] = ???

  override def describePrefixListsAsync(asyncHandler: AsyncHandler[DescribePrefixListsRequest, DescribePrefixListsResult]): Future[DescribePrefixListsResult] = ???

  override def describePrincipalIdFormatAsync(describePrincipalIdFormatRequest: DescribePrincipalIdFormatRequest): Future[DescribePrincipalIdFormatResult] = ???

  override def describePrincipalIdFormatAsync(describePrincipalIdFormatRequest: DescribePrincipalIdFormatRequest, asyncHandler: AsyncHandler[DescribePrincipalIdFormatRequest, DescribePrincipalIdFormatResult]): Future[DescribePrincipalIdFormatResult] = ???

  override def describeRegionsAsync(describeRegionsRequest: DescribeRegionsRequest): Future[DescribeRegionsResult] = ???

  override def describeRegionsAsync(describeRegionsRequest: DescribeRegionsRequest, asyncHandler: AsyncHandler[DescribeRegionsRequest, DescribeRegionsResult]): Future[DescribeRegionsResult] = ???

  override def describeRegionsAsync(): Future[DescribeRegionsResult] = ???

  override def describeRegionsAsync(asyncHandler: AsyncHandler[DescribeRegionsRequest, DescribeRegionsResult]): Future[DescribeRegionsResult] = ???

  override def describeReservedInstancesAsync(describeReservedInstancesRequest: DescribeReservedInstancesRequest): Future[DescribeReservedInstancesResult] = ???

  override def describeReservedInstancesAsync(describeReservedInstancesRequest: DescribeReservedInstancesRequest, asyncHandler: AsyncHandler[DescribeReservedInstancesRequest, DescribeReservedInstancesResult]): Future[DescribeReservedInstancesResult] = ???

  override def describeReservedInstancesAsync(): Future[DescribeReservedInstancesResult] = ???

  override def describeReservedInstancesAsync(asyncHandler: AsyncHandler[DescribeReservedInstancesRequest, DescribeReservedInstancesResult]): Future[DescribeReservedInstancesResult] = ???

  override def describeReservedInstancesListingsAsync(describeReservedInstancesListingsRequest: DescribeReservedInstancesListingsRequest): Future[DescribeReservedInstancesListingsResult] = ???

  override def describeReservedInstancesListingsAsync(describeReservedInstancesListingsRequest: DescribeReservedInstancesListingsRequest, asyncHandler: AsyncHandler[DescribeReservedInstancesListingsRequest, DescribeReservedInstancesListingsResult]): Future[DescribeReservedInstancesListingsResult] = ???

  override def describeReservedInstancesListingsAsync(): Future[DescribeReservedInstancesListingsResult] = ???

  override def describeReservedInstancesListingsAsync(asyncHandler: AsyncHandler[DescribeReservedInstancesListingsRequest, DescribeReservedInstancesListingsResult]): Future[DescribeReservedInstancesListingsResult] = ???

  override def describeReservedInstancesModificationsAsync(describeReservedInstancesModificationsRequest: DescribeReservedInstancesModificationsRequest): Future[DescribeReservedInstancesModificationsResult] = ???

  override def describeReservedInstancesModificationsAsync(describeReservedInstancesModificationsRequest: DescribeReservedInstancesModificationsRequest, asyncHandler: AsyncHandler[DescribeReservedInstancesModificationsRequest, DescribeReservedInstancesModificationsResult]): Future[DescribeReservedInstancesModificationsResult] = ???

  override def describeReservedInstancesModificationsAsync(): Future[DescribeReservedInstancesModificationsResult] = ???

  override def describeReservedInstancesModificationsAsync(asyncHandler: AsyncHandler[DescribeReservedInstancesModificationsRequest, DescribeReservedInstancesModificationsResult]): Future[DescribeReservedInstancesModificationsResult] = ???

  override def describeReservedInstancesOfferingsAsync(describeReservedInstancesOfferingsRequest: DescribeReservedInstancesOfferingsRequest): Future[DescribeReservedInstancesOfferingsResult] = ???

  override def describeReservedInstancesOfferingsAsync(describeReservedInstancesOfferingsRequest: DescribeReservedInstancesOfferingsRequest, asyncHandler: AsyncHandler[DescribeReservedInstancesOfferingsRequest, DescribeReservedInstancesOfferingsResult]): Future[DescribeReservedInstancesOfferingsResult] = ???

  override def describeReservedInstancesOfferingsAsync(): Future[DescribeReservedInstancesOfferingsResult] = ???

  override def describeReservedInstancesOfferingsAsync(asyncHandler: AsyncHandler[DescribeReservedInstancesOfferingsRequest, DescribeReservedInstancesOfferingsResult]): Future[DescribeReservedInstancesOfferingsResult] = ???

  override def describeRouteTablesAsync(describeRouteTablesRequest: DescribeRouteTablesRequest): Future[DescribeRouteTablesResult] = ???

  override def describeRouteTablesAsync(describeRouteTablesRequest: DescribeRouteTablesRequest, asyncHandler: AsyncHandler[DescribeRouteTablesRequest, DescribeRouteTablesResult]): Future[DescribeRouteTablesResult] = ???

  override def describeRouteTablesAsync(): Future[DescribeRouteTablesResult] = ???

  override def describeRouteTablesAsync(asyncHandler: AsyncHandler[DescribeRouteTablesRequest, DescribeRouteTablesResult]): Future[DescribeRouteTablesResult] = ???

  override def describeScheduledInstanceAvailabilityAsync(describeScheduledInstanceAvailabilityRequest: DescribeScheduledInstanceAvailabilityRequest): Future[DescribeScheduledInstanceAvailabilityResult] = ???

  override def describeScheduledInstanceAvailabilityAsync(describeScheduledInstanceAvailabilityRequest: DescribeScheduledInstanceAvailabilityRequest, asyncHandler: AsyncHandler[DescribeScheduledInstanceAvailabilityRequest, DescribeScheduledInstanceAvailabilityResult]): Future[DescribeScheduledInstanceAvailabilityResult] = ???

  override def describeScheduledInstancesAsync(describeScheduledInstancesRequest: DescribeScheduledInstancesRequest): Future[DescribeScheduledInstancesResult] = ???

  override def describeScheduledInstancesAsync(describeScheduledInstancesRequest: DescribeScheduledInstancesRequest, asyncHandler: AsyncHandler[DescribeScheduledInstancesRequest, DescribeScheduledInstancesResult]): Future[DescribeScheduledInstancesResult] = ???

  override def describeSecurityGroupReferencesAsync(describeSecurityGroupReferencesRequest: DescribeSecurityGroupReferencesRequest): Future[DescribeSecurityGroupReferencesResult] = ???

  override def describeSecurityGroupReferencesAsync(describeSecurityGroupReferencesRequest: DescribeSecurityGroupReferencesRequest, asyncHandler: AsyncHandler[DescribeSecurityGroupReferencesRequest, DescribeSecurityGroupReferencesResult]): Future[DescribeSecurityGroupReferencesResult] = ???

  override def describeSecurityGroupsAsync(describeSecurityGroupsRequest: DescribeSecurityGroupsRequest): Future[DescribeSecurityGroupsResult] = ???

  override def describeSecurityGroupsAsync(describeSecurityGroupsRequest: DescribeSecurityGroupsRequest, asyncHandler: AsyncHandler[DescribeSecurityGroupsRequest, DescribeSecurityGroupsResult]): Future[DescribeSecurityGroupsResult] = ???

  override def describeSecurityGroupsAsync(): Future[DescribeSecurityGroupsResult] = ???

  override def describeSecurityGroupsAsync(asyncHandler: AsyncHandler[DescribeSecurityGroupsRequest, DescribeSecurityGroupsResult]): Future[DescribeSecurityGroupsResult] = ???

  override def describeSnapshotAttributeAsync(describeSnapshotAttributeRequest: DescribeSnapshotAttributeRequest): Future[DescribeSnapshotAttributeResult] = ???

  override def describeSnapshotAttributeAsync(describeSnapshotAttributeRequest: DescribeSnapshotAttributeRequest, asyncHandler: AsyncHandler[DescribeSnapshotAttributeRequest, DescribeSnapshotAttributeResult]): Future[DescribeSnapshotAttributeResult] = ???

  override def describeSnapshotsAsync(describeSnapshotsRequest: DescribeSnapshotsRequest): Future[DescribeSnapshotsResult] = ???

  override def describeSnapshotsAsync(describeSnapshotsRequest: DescribeSnapshotsRequest, asyncHandler: AsyncHandler[DescribeSnapshotsRequest, DescribeSnapshotsResult]): Future[DescribeSnapshotsResult] = ???

  override def describeSnapshotsAsync(): Future[DescribeSnapshotsResult] = ???

  override def describeSnapshotsAsync(asyncHandler: AsyncHandler[DescribeSnapshotsRequest, DescribeSnapshotsResult]): Future[DescribeSnapshotsResult] = ???

  override def describeSpotDatafeedSubscriptionAsync(describeSpotDatafeedSubscriptionRequest: DescribeSpotDatafeedSubscriptionRequest): Future[DescribeSpotDatafeedSubscriptionResult] = ???

  override def describeSpotDatafeedSubscriptionAsync(describeSpotDatafeedSubscriptionRequest: DescribeSpotDatafeedSubscriptionRequest, asyncHandler: AsyncHandler[DescribeSpotDatafeedSubscriptionRequest, DescribeSpotDatafeedSubscriptionResult]): Future[DescribeSpotDatafeedSubscriptionResult] = ???

  override def describeSpotDatafeedSubscriptionAsync(): Future[DescribeSpotDatafeedSubscriptionResult] = ???

  override def describeSpotDatafeedSubscriptionAsync(asyncHandler: AsyncHandler[DescribeSpotDatafeedSubscriptionRequest, DescribeSpotDatafeedSubscriptionResult]): Future[DescribeSpotDatafeedSubscriptionResult] = ???

  override def describeSpotFleetInstancesAsync(describeSpotFleetInstancesRequest: DescribeSpotFleetInstancesRequest): Future[DescribeSpotFleetInstancesResult] = ???

  override def describeSpotFleetInstancesAsync(describeSpotFleetInstancesRequest: DescribeSpotFleetInstancesRequest, asyncHandler: AsyncHandler[DescribeSpotFleetInstancesRequest, DescribeSpotFleetInstancesResult]): Future[DescribeSpotFleetInstancesResult] = ???

  override def describeSpotFleetRequestHistoryAsync(describeSpotFleetRequestHistoryRequest: DescribeSpotFleetRequestHistoryRequest): Future[DescribeSpotFleetRequestHistoryResult] = ???

  override def describeSpotFleetRequestHistoryAsync(describeSpotFleetRequestHistoryRequest: DescribeSpotFleetRequestHistoryRequest, asyncHandler: AsyncHandler[DescribeSpotFleetRequestHistoryRequest, DescribeSpotFleetRequestHistoryResult]): Future[DescribeSpotFleetRequestHistoryResult] = ???

  override def describeSpotFleetRequestsAsync(describeSpotFleetRequestsRequest: DescribeSpotFleetRequestsRequest): Future[DescribeSpotFleetRequestsResult] = ???

  override def describeSpotFleetRequestsAsync(describeSpotFleetRequestsRequest: DescribeSpotFleetRequestsRequest, asyncHandler: AsyncHandler[DescribeSpotFleetRequestsRequest, DescribeSpotFleetRequestsResult]): Future[DescribeSpotFleetRequestsResult] = ???

  override def describeSpotFleetRequestsAsync(): Future[DescribeSpotFleetRequestsResult] = ???

  override def describeSpotFleetRequestsAsync(asyncHandler: AsyncHandler[DescribeSpotFleetRequestsRequest, DescribeSpotFleetRequestsResult]): Future[DescribeSpotFleetRequestsResult] = ???

  override def describeSpotInstanceRequestsAsync(describeSpotInstanceRequestsRequest: DescribeSpotInstanceRequestsRequest): Future[DescribeSpotInstanceRequestsResult] = ???

  override def describeSpotInstanceRequestsAsync(describeSpotInstanceRequestsRequest: DescribeSpotInstanceRequestsRequest, asyncHandler: AsyncHandler[DescribeSpotInstanceRequestsRequest, DescribeSpotInstanceRequestsResult]): Future[DescribeSpotInstanceRequestsResult] = ???

  override def describeSpotInstanceRequestsAsync(): Future[DescribeSpotInstanceRequestsResult] = ???

  override def describeSpotInstanceRequestsAsync(asyncHandler: AsyncHandler[DescribeSpotInstanceRequestsRequest, DescribeSpotInstanceRequestsResult]): Future[DescribeSpotInstanceRequestsResult] = ???

  override def describeSpotPriceHistoryAsync(describeSpotPriceHistoryRequest: DescribeSpotPriceHistoryRequest): Future[DescribeSpotPriceHistoryResult] = ???

  override def describeSpotPriceHistoryAsync(describeSpotPriceHistoryRequest: DescribeSpotPriceHistoryRequest, asyncHandler: AsyncHandler[DescribeSpotPriceHistoryRequest, DescribeSpotPriceHistoryResult]): Future[DescribeSpotPriceHistoryResult] = ???

  override def describeSpotPriceHistoryAsync(): Future[DescribeSpotPriceHistoryResult] = ???

  override def describeSpotPriceHistoryAsync(asyncHandler: AsyncHandler[DescribeSpotPriceHistoryRequest, DescribeSpotPriceHistoryResult]): Future[DescribeSpotPriceHistoryResult] = ???

  override def describeStaleSecurityGroupsAsync(describeStaleSecurityGroupsRequest: DescribeStaleSecurityGroupsRequest): Future[DescribeStaleSecurityGroupsResult] = ???

  override def describeStaleSecurityGroupsAsync(describeStaleSecurityGroupsRequest: DescribeStaleSecurityGroupsRequest, asyncHandler: AsyncHandler[DescribeStaleSecurityGroupsRequest, DescribeStaleSecurityGroupsResult]): Future[DescribeStaleSecurityGroupsResult] = ???

  override def describeSubnetsAsync(describeSubnetsRequest: DescribeSubnetsRequest): Future[DescribeSubnetsResult] = ???

  override def describeSubnetsAsync(describeSubnetsRequest: DescribeSubnetsRequest, asyncHandler: AsyncHandler[DescribeSubnetsRequest, DescribeSubnetsResult]): Future[DescribeSubnetsResult] = ???

  override def describeSubnetsAsync(): Future[DescribeSubnetsResult] = ???

  override def describeSubnetsAsync(asyncHandler: AsyncHandler[DescribeSubnetsRequest, DescribeSubnetsResult]): Future[DescribeSubnetsResult] = ???

  override def describeTagsAsync(describeTagsRequest: DescribeTagsRequest): Future[DescribeTagsResult] = ???

  override def describeTagsAsync(describeTagsRequest: DescribeTagsRequest, asyncHandler: AsyncHandler[DescribeTagsRequest, DescribeTagsResult]): Future[DescribeTagsResult] = ???

  override def describeTagsAsync(): Future[DescribeTagsResult] = ???

  override def describeTagsAsync(asyncHandler: AsyncHandler[DescribeTagsRequest, DescribeTagsResult]): Future[DescribeTagsResult] = ???

  override def describeVolumeAttributeAsync(describeVolumeAttributeRequest: DescribeVolumeAttributeRequest): Future[DescribeVolumeAttributeResult] = ???

  override def describeVolumeAttributeAsync(describeVolumeAttributeRequest: DescribeVolumeAttributeRequest, asyncHandler: AsyncHandler[DescribeVolumeAttributeRequest, DescribeVolumeAttributeResult]): Future[DescribeVolumeAttributeResult] = ???

  override def describeVolumeStatusAsync(describeVolumeStatusRequest: DescribeVolumeStatusRequest): Future[DescribeVolumeStatusResult] = ???

  override def describeVolumeStatusAsync(describeVolumeStatusRequest: DescribeVolumeStatusRequest, asyncHandler: AsyncHandler[DescribeVolumeStatusRequest, DescribeVolumeStatusResult]): Future[DescribeVolumeStatusResult] = ???

  override def describeVolumeStatusAsync(): Future[DescribeVolumeStatusResult] = ???

  override def describeVolumeStatusAsync(asyncHandler: AsyncHandler[DescribeVolumeStatusRequest, DescribeVolumeStatusResult]): Future[DescribeVolumeStatusResult] = ???

  override def describeVolumesAsync(describeVolumesRequest: DescribeVolumesRequest): Future[DescribeVolumesResult] = ???

  override def describeVolumesAsync(describeVolumesRequest: DescribeVolumesRequest, asyncHandler: AsyncHandler[DescribeVolumesRequest, DescribeVolumesResult]): Future[DescribeVolumesResult] = ???

  override def describeVolumesAsync(): Future[DescribeVolumesResult] = ???

  override def describeVolumesAsync(asyncHandler: AsyncHandler[DescribeVolumesRequest, DescribeVolumesResult]): Future[DescribeVolumesResult] = ???

  override def describeVolumesModificationsAsync(describeVolumesModificationsRequest: DescribeVolumesModificationsRequest): Future[DescribeVolumesModificationsResult] = ???

  override def describeVolumesModificationsAsync(describeVolumesModificationsRequest: DescribeVolumesModificationsRequest, asyncHandler: AsyncHandler[DescribeVolumesModificationsRequest, DescribeVolumesModificationsResult]): Future[DescribeVolumesModificationsResult] = ???

  override def describeVpcAttributeAsync(describeVpcAttributeRequest: DescribeVpcAttributeRequest): Future[DescribeVpcAttributeResult] = ???

  override def describeVpcAttributeAsync(describeVpcAttributeRequest: DescribeVpcAttributeRequest, asyncHandler: AsyncHandler[DescribeVpcAttributeRequest, DescribeVpcAttributeResult]): Future[DescribeVpcAttributeResult] = ???

  override def describeVpcClassicLinkAsync(describeVpcClassicLinkRequest: DescribeVpcClassicLinkRequest): Future[DescribeVpcClassicLinkResult] = ???

  override def describeVpcClassicLinkAsync(describeVpcClassicLinkRequest: DescribeVpcClassicLinkRequest, asyncHandler: AsyncHandler[DescribeVpcClassicLinkRequest, DescribeVpcClassicLinkResult]): Future[DescribeVpcClassicLinkResult] = ???

  override def describeVpcClassicLinkAsync(): Future[DescribeVpcClassicLinkResult] = ???

  override def describeVpcClassicLinkAsync(asyncHandler: AsyncHandler[DescribeVpcClassicLinkRequest, DescribeVpcClassicLinkResult]): Future[DescribeVpcClassicLinkResult] = ???

  override def describeVpcClassicLinkDnsSupportAsync(describeVpcClassicLinkDnsSupportRequest: DescribeVpcClassicLinkDnsSupportRequest): Future[DescribeVpcClassicLinkDnsSupportResult] = ???

  override def describeVpcClassicLinkDnsSupportAsync(describeVpcClassicLinkDnsSupportRequest: DescribeVpcClassicLinkDnsSupportRequest, asyncHandler: AsyncHandler[DescribeVpcClassicLinkDnsSupportRequest, DescribeVpcClassicLinkDnsSupportResult]): Future[DescribeVpcClassicLinkDnsSupportResult] = ???

  override def describeVpcEndpointConnectionNotificationsAsync(describeVpcEndpointConnectionNotificationsRequest: DescribeVpcEndpointConnectionNotificationsRequest): Future[DescribeVpcEndpointConnectionNotificationsResult] = ???

  override def describeVpcEndpointConnectionNotificationsAsync(describeVpcEndpointConnectionNotificationsRequest: DescribeVpcEndpointConnectionNotificationsRequest, asyncHandler: AsyncHandler[DescribeVpcEndpointConnectionNotificationsRequest, DescribeVpcEndpointConnectionNotificationsResult]): Future[DescribeVpcEndpointConnectionNotificationsResult] = ???

  override def describeVpcEndpointConnectionsAsync(describeVpcEndpointConnectionsRequest: DescribeVpcEndpointConnectionsRequest): Future[DescribeVpcEndpointConnectionsResult] = ???

  override def describeVpcEndpointConnectionsAsync(describeVpcEndpointConnectionsRequest: DescribeVpcEndpointConnectionsRequest, asyncHandler: AsyncHandler[DescribeVpcEndpointConnectionsRequest, DescribeVpcEndpointConnectionsResult]): Future[DescribeVpcEndpointConnectionsResult] = ???

  override def describeVpcEndpointServiceConfigurationsAsync(describeVpcEndpointServiceConfigurationsRequest: DescribeVpcEndpointServiceConfigurationsRequest): Future[DescribeVpcEndpointServiceConfigurationsResult] = ???

  override def describeVpcEndpointServiceConfigurationsAsync(describeVpcEndpointServiceConfigurationsRequest: DescribeVpcEndpointServiceConfigurationsRequest, asyncHandler: AsyncHandler[DescribeVpcEndpointServiceConfigurationsRequest, DescribeVpcEndpointServiceConfigurationsResult]): Future[DescribeVpcEndpointServiceConfigurationsResult] = ???

  override def describeVpcEndpointServicePermissionsAsync(describeVpcEndpointServicePermissionsRequest: DescribeVpcEndpointServicePermissionsRequest): Future[DescribeVpcEndpointServicePermissionsResult] = ???

  override def describeVpcEndpointServicePermissionsAsync(describeVpcEndpointServicePermissionsRequest: DescribeVpcEndpointServicePermissionsRequest, asyncHandler: AsyncHandler[DescribeVpcEndpointServicePermissionsRequest, DescribeVpcEndpointServicePermissionsResult]): Future[DescribeVpcEndpointServicePermissionsResult] = ???

  override def describeVpcEndpointServicesAsync(describeVpcEndpointServicesRequest: DescribeVpcEndpointServicesRequest): Future[DescribeVpcEndpointServicesResult] = ???

  override def describeVpcEndpointServicesAsync(describeVpcEndpointServicesRequest: DescribeVpcEndpointServicesRequest, asyncHandler: AsyncHandler[DescribeVpcEndpointServicesRequest, DescribeVpcEndpointServicesResult]): Future[DescribeVpcEndpointServicesResult] = ???

  override def describeVpcEndpointServicesAsync(): Future[DescribeVpcEndpointServicesResult] = ???

  override def describeVpcEndpointServicesAsync(asyncHandler: AsyncHandler[DescribeVpcEndpointServicesRequest, DescribeVpcEndpointServicesResult]): Future[DescribeVpcEndpointServicesResult] = ???

  override def describeVpcEndpointsAsync(describeVpcEndpointsRequest: DescribeVpcEndpointsRequest): Future[DescribeVpcEndpointsResult] = ???

  override def describeVpcEndpointsAsync(describeVpcEndpointsRequest: DescribeVpcEndpointsRequest, asyncHandler: AsyncHandler[DescribeVpcEndpointsRequest, DescribeVpcEndpointsResult]): Future[DescribeVpcEndpointsResult] = ???

  override def describeVpcEndpointsAsync(): Future[DescribeVpcEndpointsResult] = ???

  override def describeVpcEndpointsAsync(asyncHandler: AsyncHandler[DescribeVpcEndpointsRequest, DescribeVpcEndpointsResult]): Future[DescribeVpcEndpointsResult] = ???

  override def describeVpcPeeringConnectionsAsync(describeVpcPeeringConnectionsRequest: DescribeVpcPeeringConnectionsRequest): Future[DescribeVpcPeeringConnectionsResult] = ???

  override def describeVpcPeeringConnectionsAsync(describeVpcPeeringConnectionsRequest: DescribeVpcPeeringConnectionsRequest, asyncHandler: AsyncHandler[DescribeVpcPeeringConnectionsRequest, DescribeVpcPeeringConnectionsResult]): Future[DescribeVpcPeeringConnectionsResult] = ???

  override def describeVpcPeeringConnectionsAsync(): Future[DescribeVpcPeeringConnectionsResult] = ???

  override def describeVpcPeeringConnectionsAsync(asyncHandler: AsyncHandler[DescribeVpcPeeringConnectionsRequest, DescribeVpcPeeringConnectionsResult]): Future[DescribeVpcPeeringConnectionsResult] = ???

  override def describeVpcsAsync(describeVpcsRequest: DescribeVpcsRequest): Future[DescribeVpcsResult] = ???

  override def describeVpcsAsync(describeVpcsRequest: DescribeVpcsRequest, asyncHandler: AsyncHandler[DescribeVpcsRequest, DescribeVpcsResult]): Future[DescribeVpcsResult] = ???

  override def describeVpcsAsync(): Future[DescribeVpcsResult] = ???

  override def describeVpcsAsync(asyncHandler: AsyncHandler[DescribeVpcsRequest, DescribeVpcsResult]): Future[DescribeVpcsResult] = ???

  override def describeVpnConnectionsAsync(describeVpnConnectionsRequest: DescribeVpnConnectionsRequest): Future[DescribeVpnConnectionsResult] = ???

  override def describeVpnConnectionsAsync(describeVpnConnectionsRequest: DescribeVpnConnectionsRequest, asyncHandler: AsyncHandler[DescribeVpnConnectionsRequest, DescribeVpnConnectionsResult]): Future[DescribeVpnConnectionsResult] = ???

  override def describeVpnConnectionsAsync(): Future[DescribeVpnConnectionsResult] = ???

  override def describeVpnConnectionsAsync(asyncHandler: AsyncHandler[DescribeVpnConnectionsRequest, DescribeVpnConnectionsResult]): Future[DescribeVpnConnectionsResult] = ???

  override def describeVpnGatewaysAsync(describeVpnGatewaysRequest: DescribeVpnGatewaysRequest): Future[DescribeVpnGatewaysResult] = ???

  override def describeVpnGatewaysAsync(describeVpnGatewaysRequest: DescribeVpnGatewaysRequest, asyncHandler: AsyncHandler[DescribeVpnGatewaysRequest, DescribeVpnGatewaysResult]): Future[DescribeVpnGatewaysResult] = ???

  override def describeVpnGatewaysAsync(): Future[DescribeVpnGatewaysResult] = ???

  override def describeVpnGatewaysAsync(asyncHandler: AsyncHandler[DescribeVpnGatewaysRequest, DescribeVpnGatewaysResult]): Future[DescribeVpnGatewaysResult] = ???

  override def detachClassicLinkVpcAsync(detachClassicLinkVpcRequest: DetachClassicLinkVpcRequest): Future[DetachClassicLinkVpcResult] = ???

  override def detachClassicLinkVpcAsync(detachClassicLinkVpcRequest: DetachClassicLinkVpcRequest, asyncHandler: AsyncHandler[DetachClassicLinkVpcRequest, DetachClassicLinkVpcResult]): Future[DetachClassicLinkVpcResult] = ???

  override def detachInternetGatewayAsync(detachInternetGatewayRequest: DetachInternetGatewayRequest): Future[DetachInternetGatewayResult] = ???

  override def detachInternetGatewayAsync(detachInternetGatewayRequest: DetachInternetGatewayRequest, asyncHandler: AsyncHandler[DetachInternetGatewayRequest, DetachInternetGatewayResult]): Future[DetachInternetGatewayResult] = ???

  override def detachNetworkInterfaceAsync(detachNetworkInterfaceRequest: DetachNetworkInterfaceRequest): Future[DetachNetworkInterfaceResult] = ???

  override def detachNetworkInterfaceAsync(detachNetworkInterfaceRequest: DetachNetworkInterfaceRequest, asyncHandler: AsyncHandler[DetachNetworkInterfaceRequest, DetachNetworkInterfaceResult]): Future[DetachNetworkInterfaceResult] = ???

  override def detachVolumeAsync(detachVolumeRequest: DetachVolumeRequest): Future[DetachVolumeResult] = ???

  override def detachVolumeAsync(detachVolumeRequest: DetachVolumeRequest, asyncHandler: AsyncHandler[DetachVolumeRequest, DetachVolumeResult]): Future[DetachVolumeResult] = ???

  override def detachVpnGatewayAsync(detachVpnGatewayRequest: DetachVpnGatewayRequest): Future[DetachVpnGatewayResult] = ???

  override def detachVpnGatewayAsync(detachVpnGatewayRequest: DetachVpnGatewayRequest, asyncHandler: AsyncHandler[DetachVpnGatewayRequest, DetachVpnGatewayResult]): Future[DetachVpnGatewayResult] = ???

  override def disableVgwRoutePropagationAsync(disableVgwRoutePropagationRequest: DisableVgwRoutePropagationRequest): Future[DisableVgwRoutePropagationResult] = ???

  override def disableVgwRoutePropagationAsync(disableVgwRoutePropagationRequest: DisableVgwRoutePropagationRequest, asyncHandler: AsyncHandler[DisableVgwRoutePropagationRequest, DisableVgwRoutePropagationResult]): Future[DisableVgwRoutePropagationResult] = ???

  override def disableVpcClassicLinkAsync(disableVpcClassicLinkRequest: DisableVpcClassicLinkRequest): Future[DisableVpcClassicLinkResult] = ???

  override def disableVpcClassicLinkAsync(disableVpcClassicLinkRequest: DisableVpcClassicLinkRequest, asyncHandler: AsyncHandler[DisableVpcClassicLinkRequest, DisableVpcClassicLinkResult]): Future[DisableVpcClassicLinkResult] = ???

  override def disableVpcClassicLinkDnsSupportAsync(disableVpcClassicLinkDnsSupportRequest: DisableVpcClassicLinkDnsSupportRequest): Future[DisableVpcClassicLinkDnsSupportResult] = ???

  override def disableVpcClassicLinkDnsSupportAsync(disableVpcClassicLinkDnsSupportRequest: DisableVpcClassicLinkDnsSupportRequest, asyncHandler: AsyncHandler[DisableVpcClassicLinkDnsSupportRequest, DisableVpcClassicLinkDnsSupportResult]): Future[DisableVpcClassicLinkDnsSupportResult] = ???

  override def disassociateAddressAsync(disassociateAddressRequest: DisassociateAddressRequest): Future[DisassociateAddressResult] = ???

  override def disassociateAddressAsync(disassociateAddressRequest: DisassociateAddressRequest, asyncHandler: AsyncHandler[DisassociateAddressRequest, DisassociateAddressResult]): Future[DisassociateAddressResult] = ???

  override def disassociateIamInstanceProfileAsync(disassociateIamInstanceProfileRequest: DisassociateIamInstanceProfileRequest): Future[DisassociateIamInstanceProfileResult] = ???

  override def disassociateIamInstanceProfileAsync(disassociateIamInstanceProfileRequest: DisassociateIamInstanceProfileRequest, asyncHandler: AsyncHandler[DisassociateIamInstanceProfileRequest, DisassociateIamInstanceProfileResult]): Future[DisassociateIamInstanceProfileResult] = ???

  override def disassociateRouteTableAsync(disassociateRouteTableRequest: DisassociateRouteTableRequest): Future[DisassociateRouteTableResult] = ???

  override def disassociateRouteTableAsync(disassociateRouteTableRequest: DisassociateRouteTableRequest, asyncHandler: AsyncHandler[DisassociateRouteTableRequest, DisassociateRouteTableResult]): Future[DisassociateRouteTableResult] = ???

  override def disassociateSubnetCidrBlockAsync(disassociateSubnetCidrBlockRequest: DisassociateSubnetCidrBlockRequest): Future[DisassociateSubnetCidrBlockResult] = ???

  override def disassociateSubnetCidrBlockAsync(disassociateSubnetCidrBlockRequest: DisassociateSubnetCidrBlockRequest, asyncHandler: AsyncHandler[DisassociateSubnetCidrBlockRequest, DisassociateSubnetCidrBlockResult]): Future[DisassociateSubnetCidrBlockResult] = ???

  override def disassociateVpcCidrBlockAsync(disassociateVpcCidrBlockRequest: DisassociateVpcCidrBlockRequest): Future[DisassociateVpcCidrBlockResult] = ???

  override def disassociateVpcCidrBlockAsync(disassociateVpcCidrBlockRequest: DisassociateVpcCidrBlockRequest, asyncHandler: AsyncHandler[DisassociateVpcCidrBlockRequest, DisassociateVpcCidrBlockResult]): Future[DisassociateVpcCidrBlockResult] = ???

  override def enableVgwRoutePropagationAsync(enableVgwRoutePropagationRequest: EnableVgwRoutePropagationRequest): Future[EnableVgwRoutePropagationResult] = ???

  override def enableVgwRoutePropagationAsync(enableVgwRoutePropagationRequest: EnableVgwRoutePropagationRequest, asyncHandler: AsyncHandler[EnableVgwRoutePropagationRequest, EnableVgwRoutePropagationResult]): Future[EnableVgwRoutePropagationResult] = ???

  override def enableVolumeIOAsync(enableVolumeIORequest: EnableVolumeIORequest): Future[EnableVolumeIOResult] = ???

  override def enableVolumeIOAsync(enableVolumeIORequest: EnableVolumeIORequest, asyncHandler: AsyncHandler[EnableVolumeIORequest, EnableVolumeIOResult]): Future[EnableVolumeIOResult] = ???

  override def enableVpcClassicLinkAsync(enableVpcClassicLinkRequest: EnableVpcClassicLinkRequest): Future[EnableVpcClassicLinkResult] = ???

  override def enableVpcClassicLinkAsync(enableVpcClassicLinkRequest: EnableVpcClassicLinkRequest, asyncHandler: AsyncHandler[EnableVpcClassicLinkRequest, EnableVpcClassicLinkResult]): Future[EnableVpcClassicLinkResult] = ???

  override def enableVpcClassicLinkDnsSupportAsync(enableVpcClassicLinkDnsSupportRequest: EnableVpcClassicLinkDnsSupportRequest): Future[EnableVpcClassicLinkDnsSupportResult] = ???

  override def enableVpcClassicLinkDnsSupportAsync(enableVpcClassicLinkDnsSupportRequest: EnableVpcClassicLinkDnsSupportRequest, asyncHandler: AsyncHandler[EnableVpcClassicLinkDnsSupportRequest, EnableVpcClassicLinkDnsSupportResult]): Future[EnableVpcClassicLinkDnsSupportResult] = ???

  override def getConsoleOutputAsync(getConsoleOutputRequest: GetConsoleOutputRequest): Future[GetConsoleOutputResult] = ???

  override def getConsoleOutputAsync(getConsoleOutputRequest: GetConsoleOutputRequest, asyncHandler: AsyncHandler[GetConsoleOutputRequest, GetConsoleOutputResult]): Future[GetConsoleOutputResult] = ???

  override def getConsoleScreenshotAsync(getConsoleScreenshotRequest: GetConsoleScreenshotRequest): Future[GetConsoleScreenshotResult] = ???

  override def getConsoleScreenshotAsync(getConsoleScreenshotRequest: GetConsoleScreenshotRequest, asyncHandler: AsyncHandler[GetConsoleScreenshotRequest, GetConsoleScreenshotResult]): Future[GetConsoleScreenshotResult] = ???

  override def getHostReservationPurchasePreviewAsync(getHostReservationPurchasePreviewRequest: GetHostReservationPurchasePreviewRequest): Future[GetHostReservationPurchasePreviewResult] = ???

  override def getHostReservationPurchasePreviewAsync(getHostReservationPurchasePreviewRequest: GetHostReservationPurchasePreviewRequest, asyncHandler: AsyncHandler[GetHostReservationPurchasePreviewRequest, GetHostReservationPurchasePreviewResult]): Future[GetHostReservationPurchasePreviewResult] = ???

  override def getLaunchTemplateDataAsync(getLaunchTemplateDataRequest: GetLaunchTemplateDataRequest): Future[GetLaunchTemplateDataResult] = ???

  override def getLaunchTemplateDataAsync(getLaunchTemplateDataRequest: GetLaunchTemplateDataRequest, asyncHandler: AsyncHandler[GetLaunchTemplateDataRequest, GetLaunchTemplateDataResult]): Future[GetLaunchTemplateDataResult] = ???

  override def getPasswordDataAsync(getPasswordDataRequest: GetPasswordDataRequest): Future[GetPasswordDataResult] = ???

  override def getPasswordDataAsync(getPasswordDataRequest: GetPasswordDataRequest, asyncHandler: AsyncHandler[GetPasswordDataRequest, GetPasswordDataResult]): Future[GetPasswordDataResult] = ???

  override def getReservedInstancesExchangeQuoteAsync(getReservedInstancesExchangeQuoteRequest: GetReservedInstancesExchangeQuoteRequest): Future[GetReservedInstancesExchangeQuoteResult] = ???

  override def getReservedInstancesExchangeQuoteAsync(getReservedInstancesExchangeQuoteRequest: GetReservedInstancesExchangeQuoteRequest, asyncHandler: AsyncHandler[GetReservedInstancesExchangeQuoteRequest, GetReservedInstancesExchangeQuoteResult]): Future[GetReservedInstancesExchangeQuoteResult] = ???

  override def importImageAsync(importImageRequest: ImportImageRequest): Future[ImportImageResult] = ???

  override def importImageAsync(importImageRequest: ImportImageRequest, asyncHandler: AsyncHandler[ImportImageRequest, ImportImageResult]): Future[ImportImageResult] = ???

  override def importImageAsync(): Future[ImportImageResult] = ???

  override def importImageAsync(asyncHandler: AsyncHandler[ImportImageRequest, ImportImageResult]): Future[ImportImageResult] = ???

  override def importInstanceAsync(importInstanceRequest: ImportInstanceRequest): Future[ImportInstanceResult] = ???

  override def importInstanceAsync(importInstanceRequest: ImportInstanceRequest, asyncHandler: AsyncHandler[ImportInstanceRequest, ImportInstanceResult]): Future[ImportInstanceResult] = ???

  override def importKeyPairAsync(importKeyPairRequest: ImportKeyPairRequest): Future[ImportKeyPairResult] = ???

  override def importKeyPairAsync(importKeyPairRequest: ImportKeyPairRequest, asyncHandler: AsyncHandler[ImportKeyPairRequest, ImportKeyPairResult]): Future[ImportKeyPairResult] = ???

  override def importSnapshotAsync(importSnapshotRequest: ImportSnapshotRequest): Future[ImportSnapshotResult] = ???

  override def importSnapshotAsync(importSnapshotRequest: ImportSnapshotRequest, asyncHandler: AsyncHandler[ImportSnapshotRequest, ImportSnapshotResult]): Future[ImportSnapshotResult] = ???

  override def importSnapshotAsync(): Future[ImportSnapshotResult] = ???

  override def importSnapshotAsync(asyncHandler: AsyncHandler[ImportSnapshotRequest, ImportSnapshotResult]): Future[ImportSnapshotResult] = ???

  override def importVolumeAsync(importVolumeRequest: ImportVolumeRequest): Future[ImportVolumeResult] = ???

  override def importVolumeAsync(importVolumeRequest: ImportVolumeRequest, asyncHandler: AsyncHandler[ImportVolumeRequest, ImportVolumeResult]): Future[ImportVolumeResult] = ???

  override def modifyFleetAsync(modifyFleetRequest: ModifyFleetRequest): Future[ModifyFleetResult] = ???

  override def modifyFleetAsync(modifyFleetRequest: ModifyFleetRequest, asyncHandler: AsyncHandler[ModifyFleetRequest, ModifyFleetResult]): Future[ModifyFleetResult] = ???

  override def modifyFpgaImageAttributeAsync(modifyFpgaImageAttributeRequest: ModifyFpgaImageAttributeRequest): Future[ModifyFpgaImageAttributeResult] = ???

  override def modifyFpgaImageAttributeAsync(modifyFpgaImageAttributeRequest: ModifyFpgaImageAttributeRequest, asyncHandler: AsyncHandler[ModifyFpgaImageAttributeRequest, ModifyFpgaImageAttributeResult]): Future[ModifyFpgaImageAttributeResult] = ???

  override def modifyHostsAsync(modifyHostsRequest: ModifyHostsRequest): Future[ModifyHostsResult] = ???

  override def modifyHostsAsync(modifyHostsRequest: ModifyHostsRequest, asyncHandler: AsyncHandler[ModifyHostsRequest, ModifyHostsResult]): Future[ModifyHostsResult] = ???

  override def modifyIdFormatAsync(modifyIdFormatRequest: ModifyIdFormatRequest): Future[ModifyIdFormatResult] = ???

  override def modifyIdFormatAsync(modifyIdFormatRequest: ModifyIdFormatRequest, asyncHandler: AsyncHandler[ModifyIdFormatRequest, ModifyIdFormatResult]): Future[ModifyIdFormatResult] = ???

  override def modifyIdentityIdFormatAsync(modifyIdentityIdFormatRequest: ModifyIdentityIdFormatRequest): Future[ModifyIdentityIdFormatResult] = ???

  override def modifyIdentityIdFormatAsync(modifyIdentityIdFormatRequest: ModifyIdentityIdFormatRequest, asyncHandler: AsyncHandler[ModifyIdentityIdFormatRequest, ModifyIdentityIdFormatResult]): Future[ModifyIdentityIdFormatResult] = ???

  override def modifyImageAttributeAsync(modifyImageAttributeRequest: ModifyImageAttributeRequest): Future[ModifyImageAttributeResult] = ???

  override def modifyImageAttributeAsync(modifyImageAttributeRequest: ModifyImageAttributeRequest, asyncHandler: AsyncHandler[ModifyImageAttributeRequest, ModifyImageAttributeResult]): Future[ModifyImageAttributeResult] = ???

  override def modifyInstanceAttributeAsync(modifyInstanceAttributeRequest: ModifyInstanceAttributeRequest): Future[ModifyInstanceAttributeResult] = ???

  override def modifyInstanceAttributeAsync(modifyInstanceAttributeRequest: ModifyInstanceAttributeRequest, asyncHandler: AsyncHandler[ModifyInstanceAttributeRequest, ModifyInstanceAttributeResult]): Future[ModifyInstanceAttributeResult] = ???

  override def modifyInstanceCreditSpecificationAsync(modifyInstanceCreditSpecificationRequest: ModifyInstanceCreditSpecificationRequest): Future[ModifyInstanceCreditSpecificationResult] = ???

  override def modifyInstanceCreditSpecificationAsync(modifyInstanceCreditSpecificationRequest: ModifyInstanceCreditSpecificationRequest, asyncHandler: AsyncHandler[ModifyInstanceCreditSpecificationRequest, ModifyInstanceCreditSpecificationResult]): Future[ModifyInstanceCreditSpecificationResult] = ???

  override def modifyInstancePlacementAsync(modifyInstancePlacementRequest: ModifyInstancePlacementRequest): Future[ModifyInstancePlacementResult] = ???

  override def modifyInstancePlacementAsync(modifyInstancePlacementRequest: ModifyInstancePlacementRequest, asyncHandler: AsyncHandler[ModifyInstancePlacementRequest, ModifyInstancePlacementResult]): Future[ModifyInstancePlacementResult] = ???

  override def modifyLaunchTemplateAsync(modifyLaunchTemplateRequest: ModifyLaunchTemplateRequest): Future[ModifyLaunchTemplateResult] = ???

  override def modifyLaunchTemplateAsync(modifyLaunchTemplateRequest: ModifyLaunchTemplateRequest, asyncHandler: AsyncHandler[ModifyLaunchTemplateRequest, ModifyLaunchTemplateResult]): Future[ModifyLaunchTemplateResult] = ???

  override def modifyNetworkInterfaceAttributeAsync(modifyNetworkInterfaceAttributeRequest: ModifyNetworkInterfaceAttributeRequest): Future[ModifyNetworkInterfaceAttributeResult] = ???

  override def modifyNetworkInterfaceAttributeAsync(modifyNetworkInterfaceAttributeRequest: ModifyNetworkInterfaceAttributeRequest, asyncHandler: AsyncHandler[ModifyNetworkInterfaceAttributeRequest, ModifyNetworkInterfaceAttributeResult]): Future[ModifyNetworkInterfaceAttributeResult] = ???

  override def modifyReservedInstancesAsync(modifyReservedInstancesRequest: ModifyReservedInstancesRequest): Future[ModifyReservedInstancesResult] = ???

  override def modifyReservedInstancesAsync(modifyReservedInstancesRequest: ModifyReservedInstancesRequest, asyncHandler: AsyncHandler[ModifyReservedInstancesRequest, ModifyReservedInstancesResult]): Future[ModifyReservedInstancesResult] = ???

  override def modifySnapshotAttributeAsync(modifySnapshotAttributeRequest: ModifySnapshotAttributeRequest): Future[ModifySnapshotAttributeResult] = ???

  override def modifySnapshotAttributeAsync(modifySnapshotAttributeRequest: ModifySnapshotAttributeRequest, asyncHandler: AsyncHandler[ModifySnapshotAttributeRequest, ModifySnapshotAttributeResult]): Future[ModifySnapshotAttributeResult] = ???

  override def modifySpotFleetRequestAsync(modifySpotFleetRequestRequest: ModifySpotFleetRequestRequest): Future[ModifySpotFleetRequestResult] = ???

  override def modifySpotFleetRequestAsync(modifySpotFleetRequestRequest: ModifySpotFleetRequestRequest, asyncHandler: AsyncHandler[ModifySpotFleetRequestRequest, ModifySpotFleetRequestResult]): Future[ModifySpotFleetRequestResult] = ???

  override def modifySubnetAttributeAsync(modifySubnetAttributeRequest: ModifySubnetAttributeRequest): Future[ModifySubnetAttributeResult] = ???

  override def modifySubnetAttributeAsync(modifySubnetAttributeRequest: ModifySubnetAttributeRequest, asyncHandler: AsyncHandler[ModifySubnetAttributeRequest, ModifySubnetAttributeResult]): Future[ModifySubnetAttributeResult] = ???

  override def modifyVolumeAsync(modifyVolumeRequest: ModifyVolumeRequest): Future[ModifyVolumeResult] = ???

  override def modifyVolumeAsync(modifyVolumeRequest: ModifyVolumeRequest, asyncHandler: AsyncHandler[ModifyVolumeRequest, ModifyVolumeResult]): Future[ModifyVolumeResult] = ???

  override def modifyVolumeAttributeAsync(modifyVolumeAttributeRequest: ModifyVolumeAttributeRequest): Future[ModifyVolumeAttributeResult] = ???

  override def modifyVolumeAttributeAsync(modifyVolumeAttributeRequest: ModifyVolumeAttributeRequest, asyncHandler: AsyncHandler[ModifyVolumeAttributeRequest, ModifyVolumeAttributeResult]): Future[ModifyVolumeAttributeResult] = ???

  override def modifyVpcAttributeAsync(modifyVpcAttributeRequest: ModifyVpcAttributeRequest): Future[ModifyVpcAttributeResult] = ???

  override def modifyVpcAttributeAsync(modifyVpcAttributeRequest: ModifyVpcAttributeRequest, asyncHandler: AsyncHandler[ModifyVpcAttributeRequest, ModifyVpcAttributeResult]): Future[ModifyVpcAttributeResult] = ???

  override def modifyVpcEndpointAsync(modifyVpcEndpointRequest: ModifyVpcEndpointRequest): Future[ModifyVpcEndpointResult] = ???

  override def modifyVpcEndpointAsync(modifyVpcEndpointRequest: ModifyVpcEndpointRequest, asyncHandler: AsyncHandler[ModifyVpcEndpointRequest, ModifyVpcEndpointResult]): Future[ModifyVpcEndpointResult] = ???

  override def modifyVpcEndpointConnectionNotificationAsync(modifyVpcEndpointConnectionNotificationRequest: ModifyVpcEndpointConnectionNotificationRequest): Future[ModifyVpcEndpointConnectionNotificationResult] = ???

  override def modifyVpcEndpointConnectionNotificationAsync(modifyVpcEndpointConnectionNotificationRequest: ModifyVpcEndpointConnectionNotificationRequest, asyncHandler: AsyncHandler[ModifyVpcEndpointConnectionNotificationRequest, ModifyVpcEndpointConnectionNotificationResult]): Future[ModifyVpcEndpointConnectionNotificationResult] = ???

  override def modifyVpcEndpointServiceConfigurationAsync(modifyVpcEndpointServiceConfigurationRequest: ModifyVpcEndpointServiceConfigurationRequest): Future[ModifyVpcEndpointServiceConfigurationResult] = ???

  override def modifyVpcEndpointServiceConfigurationAsync(modifyVpcEndpointServiceConfigurationRequest: ModifyVpcEndpointServiceConfigurationRequest, asyncHandler: AsyncHandler[ModifyVpcEndpointServiceConfigurationRequest, ModifyVpcEndpointServiceConfigurationResult]): Future[ModifyVpcEndpointServiceConfigurationResult] = ???

  override def modifyVpcEndpointServicePermissionsAsync(modifyVpcEndpointServicePermissionsRequest: ModifyVpcEndpointServicePermissionsRequest): Future[ModifyVpcEndpointServicePermissionsResult] = ???

  override def modifyVpcEndpointServicePermissionsAsync(modifyVpcEndpointServicePermissionsRequest: ModifyVpcEndpointServicePermissionsRequest, asyncHandler: AsyncHandler[ModifyVpcEndpointServicePermissionsRequest, ModifyVpcEndpointServicePermissionsResult]): Future[ModifyVpcEndpointServicePermissionsResult] = ???

  override def modifyVpcPeeringConnectionOptionsAsync(modifyVpcPeeringConnectionOptionsRequest: ModifyVpcPeeringConnectionOptionsRequest): Future[ModifyVpcPeeringConnectionOptionsResult] = ???

  override def modifyVpcPeeringConnectionOptionsAsync(modifyVpcPeeringConnectionOptionsRequest: ModifyVpcPeeringConnectionOptionsRequest, asyncHandler: AsyncHandler[ModifyVpcPeeringConnectionOptionsRequest, ModifyVpcPeeringConnectionOptionsResult]): Future[ModifyVpcPeeringConnectionOptionsResult] = ???

  override def modifyVpcTenancyAsync(modifyVpcTenancyRequest: ModifyVpcTenancyRequest): Future[ModifyVpcTenancyResult] = ???

  override def modifyVpcTenancyAsync(modifyVpcTenancyRequest: ModifyVpcTenancyRequest, asyncHandler: AsyncHandler[ModifyVpcTenancyRequest, ModifyVpcTenancyResult]): Future[ModifyVpcTenancyResult] = ???

  override def monitorInstancesAsync(monitorInstancesRequest: MonitorInstancesRequest): Future[MonitorInstancesResult] = ???

  override def monitorInstancesAsync(monitorInstancesRequest: MonitorInstancesRequest, asyncHandler: AsyncHandler[MonitorInstancesRequest, MonitorInstancesResult]): Future[MonitorInstancesResult] = ???

  override def moveAddressToVpcAsync(moveAddressToVpcRequest: MoveAddressToVpcRequest): Future[MoveAddressToVpcResult] = ???

  override def moveAddressToVpcAsync(moveAddressToVpcRequest: MoveAddressToVpcRequest, asyncHandler: AsyncHandler[MoveAddressToVpcRequest, MoveAddressToVpcResult]): Future[MoveAddressToVpcResult] = ???

  override def purchaseHostReservationAsync(purchaseHostReservationRequest: PurchaseHostReservationRequest): Future[PurchaseHostReservationResult] = ???

  override def purchaseHostReservationAsync(purchaseHostReservationRequest: PurchaseHostReservationRequest, asyncHandler: AsyncHandler[PurchaseHostReservationRequest, PurchaseHostReservationResult]): Future[PurchaseHostReservationResult] = ???

  override def purchaseReservedInstancesOfferingAsync(purchaseReservedInstancesOfferingRequest: PurchaseReservedInstancesOfferingRequest): Future[PurchaseReservedInstancesOfferingResult] = ???

  override def purchaseReservedInstancesOfferingAsync(purchaseReservedInstancesOfferingRequest: PurchaseReservedInstancesOfferingRequest, asyncHandler: AsyncHandler[PurchaseReservedInstancesOfferingRequest, PurchaseReservedInstancesOfferingResult]): Future[PurchaseReservedInstancesOfferingResult] = ???

  override def purchaseScheduledInstancesAsync(purchaseScheduledInstancesRequest: PurchaseScheduledInstancesRequest): Future[PurchaseScheduledInstancesResult] = ???

  override def purchaseScheduledInstancesAsync(purchaseScheduledInstancesRequest: PurchaseScheduledInstancesRequest, asyncHandler: AsyncHandler[PurchaseScheduledInstancesRequest, PurchaseScheduledInstancesResult]): Future[PurchaseScheduledInstancesResult] = ???

  override def rebootInstancesAsync(rebootInstancesRequest: RebootInstancesRequest): Future[RebootInstancesResult] = ???

  override def rebootInstancesAsync(rebootInstancesRequest: RebootInstancesRequest, asyncHandler: AsyncHandler[RebootInstancesRequest, RebootInstancesResult]): Future[RebootInstancesResult] = ???

  override def registerImageAsync(registerImageRequest: RegisterImageRequest): Future[RegisterImageResult] = ???

  override def registerImageAsync(registerImageRequest: RegisterImageRequest, asyncHandler: AsyncHandler[RegisterImageRequest, RegisterImageResult]): Future[RegisterImageResult] = ???

  override def rejectVpcEndpointConnectionsAsync(rejectVpcEndpointConnectionsRequest: RejectVpcEndpointConnectionsRequest): Future[RejectVpcEndpointConnectionsResult] = ???

  override def rejectVpcEndpointConnectionsAsync(rejectVpcEndpointConnectionsRequest: RejectVpcEndpointConnectionsRequest, asyncHandler: AsyncHandler[RejectVpcEndpointConnectionsRequest, RejectVpcEndpointConnectionsResult]): Future[RejectVpcEndpointConnectionsResult] = ???

  override def rejectVpcPeeringConnectionAsync(rejectVpcPeeringConnectionRequest: RejectVpcPeeringConnectionRequest): Future[RejectVpcPeeringConnectionResult] = ???

  override def rejectVpcPeeringConnectionAsync(rejectVpcPeeringConnectionRequest: RejectVpcPeeringConnectionRequest, asyncHandler: AsyncHandler[RejectVpcPeeringConnectionRequest, RejectVpcPeeringConnectionResult]): Future[RejectVpcPeeringConnectionResult] = ???

  override def releaseAddressAsync(releaseAddressRequest: ReleaseAddressRequest): Future[ReleaseAddressResult] = ???

  override def releaseAddressAsync(releaseAddressRequest: ReleaseAddressRequest, asyncHandler: AsyncHandler[ReleaseAddressRequest, ReleaseAddressResult]): Future[ReleaseAddressResult] = ???

  override def releaseHostsAsync(releaseHostsRequest: ReleaseHostsRequest): Future[ReleaseHostsResult] = ???

  override def releaseHostsAsync(releaseHostsRequest: ReleaseHostsRequest, asyncHandler: AsyncHandler[ReleaseHostsRequest, ReleaseHostsResult]): Future[ReleaseHostsResult] = ???

  override def replaceIamInstanceProfileAssociationAsync(replaceIamInstanceProfileAssociationRequest: ReplaceIamInstanceProfileAssociationRequest): Future[ReplaceIamInstanceProfileAssociationResult] = ???

  override def replaceIamInstanceProfileAssociationAsync(replaceIamInstanceProfileAssociationRequest: ReplaceIamInstanceProfileAssociationRequest, asyncHandler: AsyncHandler[ReplaceIamInstanceProfileAssociationRequest, ReplaceIamInstanceProfileAssociationResult]): Future[ReplaceIamInstanceProfileAssociationResult] = ???

  override def replaceNetworkAclAssociationAsync(replaceNetworkAclAssociationRequest: ReplaceNetworkAclAssociationRequest): Future[ReplaceNetworkAclAssociationResult] = ???

  override def replaceNetworkAclAssociationAsync(replaceNetworkAclAssociationRequest: ReplaceNetworkAclAssociationRequest, asyncHandler: AsyncHandler[ReplaceNetworkAclAssociationRequest, ReplaceNetworkAclAssociationResult]): Future[ReplaceNetworkAclAssociationResult] = ???

  override def replaceNetworkAclEntryAsync(replaceNetworkAclEntryRequest: ReplaceNetworkAclEntryRequest): Future[ReplaceNetworkAclEntryResult] = ???

  override def replaceNetworkAclEntryAsync(replaceNetworkAclEntryRequest: ReplaceNetworkAclEntryRequest, asyncHandler: AsyncHandler[ReplaceNetworkAclEntryRequest, ReplaceNetworkAclEntryResult]): Future[ReplaceNetworkAclEntryResult] = ???

  override def replaceRouteAsync(replaceRouteRequest: ReplaceRouteRequest): Future[ReplaceRouteResult] = ???

  override def replaceRouteAsync(replaceRouteRequest: ReplaceRouteRequest, asyncHandler: AsyncHandler[ReplaceRouteRequest, ReplaceRouteResult]): Future[ReplaceRouteResult] = ???

  override def replaceRouteTableAssociationAsync(replaceRouteTableAssociationRequest: ReplaceRouteTableAssociationRequest): Future[ReplaceRouteTableAssociationResult] = ???

  override def replaceRouteTableAssociationAsync(replaceRouteTableAssociationRequest: ReplaceRouteTableAssociationRequest, asyncHandler: AsyncHandler[ReplaceRouteTableAssociationRequest, ReplaceRouteTableAssociationResult]): Future[ReplaceRouteTableAssociationResult] = ???

  override def reportInstanceStatusAsync(reportInstanceStatusRequest: ReportInstanceStatusRequest): Future[ReportInstanceStatusResult] = ???

  override def reportInstanceStatusAsync(reportInstanceStatusRequest: ReportInstanceStatusRequest, asyncHandler: AsyncHandler[ReportInstanceStatusRequest, ReportInstanceStatusResult]): Future[ReportInstanceStatusResult] = ???

  override def requestSpotFleetAsync(requestSpotFleetRequest: RequestSpotFleetRequest): Future[RequestSpotFleetResult] = ???

  override def requestSpotFleetAsync(requestSpotFleetRequest: RequestSpotFleetRequest, asyncHandler: AsyncHandler[RequestSpotFleetRequest, RequestSpotFleetResult]): Future[RequestSpotFleetResult] = ???

  override def requestSpotInstancesAsync(requestSpotInstancesRequest: RequestSpotInstancesRequest): Future[RequestSpotInstancesResult] = ???

  override def requestSpotInstancesAsync(requestSpotInstancesRequest: RequestSpotInstancesRequest, asyncHandler: AsyncHandler[RequestSpotInstancesRequest, RequestSpotInstancesResult]): Future[RequestSpotInstancesResult] = ???

  override def resetFpgaImageAttributeAsync(resetFpgaImageAttributeRequest: ResetFpgaImageAttributeRequest): Future[ResetFpgaImageAttributeResult] = ???

  override def resetFpgaImageAttributeAsync(resetFpgaImageAttributeRequest: ResetFpgaImageAttributeRequest, asyncHandler: AsyncHandler[ResetFpgaImageAttributeRequest, ResetFpgaImageAttributeResult]): Future[ResetFpgaImageAttributeResult] = ???

  override def resetImageAttributeAsync(resetImageAttributeRequest: ResetImageAttributeRequest): Future[ResetImageAttributeResult] = ???

  override def resetImageAttributeAsync(resetImageAttributeRequest: ResetImageAttributeRequest, asyncHandler: AsyncHandler[ResetImageAttributeRequest, ResetImageAttributeResult]): Future[ResetImageAttributeResult] = ???

  override def resetInstanceAttributeAsync(resetInstanceAttributeRequest: ResetInstanceAttributeRequest): Future[ResetInstanceAttributeResult] = ???

  override def resetInstanceAttributeAsync(resetInstanceAttributeRequest: ResetInstanceAttributeRequest, asyncHandler: AsyncHandler[ResetInstanceAttributeRequest, ResetInstanceAttributeResult]): Future[ResetInstanceAttributeResult] = ???

  override def resetNetworkInterfaceAttributeAsync(resetNetworkInterfaceAttributeRequest: ResetNetworkInterfaceAttributeRequest): Future[ResetNetworkInterfaceAttributeResult] = ???

  override def resetNetworkInterfaceAttributeAsync(resetNetworkInterfaceAttributeRequest: ResetNetworkInterfaceAttributeRequest, asyncHandler: AsyncHandler[ResetNetworkInterfaceAttributeRequest, ResetNetworkInterfaceAttributeResult]): Future[ResetNetworkInterfaceAttributeResult] = ???

  override def resetSnapshotAttributeAsync(resetSnapshotAttributeRequest: ResetSnapshotAttributeRequest): Future[ResetSnapshotAttributeResult] = ???

  override def resetSnapshotAttributeAsync(resetSnapshotAttributeRequest: ResetSnapshotAttributeRequest, asyncHandler: AsyncHandler[ResetSnapshotAttributeRequest, ResetSnapshotAttributeResult]): Future[ResetSnapshotAttributeResult] = ???

  override def restoreAddressToClassicAsync(restoreAddressToClassicRequest: RestoreAddressToClassicRequest): Future[RestoreAddressToClassicResult] = ???

  override def restoreAddressToClassicAsync(restoreAddressToClassicRequest: RestoreAddressToClassicRequest, asyncHandler: AsyncHandler[RestoreAddressToClassicRequest, RestoreAddressToClassicResult]): Future[RestoreAddressToClassicResult] = ???

  override def revokeSecurityGroupEgressAsync(revokeSecurityGroupEgressRequest: RevokeSecurityGroupEgressRequest): Future[RevokeSecurityGroupEgressResult] = ???

  override def revokeSecurityGroupEgressAsync(revokeSecurityGroupEgressRequest: RevokeSecurityGroupEgressRequest, asyncHandler: AsyncHandler[RevokeSecurityGroupEgressRequest, RevokeSecurityGroupEgressResult]): Future[RevokeSecurityGroupEgressResult] = ???

  override def revokeSecurityGroupIngressAsync(revokeSecurityGroupIngressRequest: RevokeSecurityGroupIngressRequest): Future[RevokeSecurityGroupIngressResult] = ???

  override def revokeSecurityGroupIngressAsync(revokeSecurityGroupIngressRequest: RevokeSecurityGroupIngressRequest, asyncHandler: AsyncHandler[RevokeSecurityGroupIngressRequest, RevokeSecurityGroupIngressResult]): Future[RevokeSecurityGroupIngressResult] = ???

  override def revokeSecurityGroupIngressAsync(): Future[RevokeSecurityGroupIngressResult] = ???

  override def revokeSecurityGroupIngressAsync(asyncHandler: AsyncHandler[RevokeSecurityGroupIngressRequest, RevokeSecurityGroupIngressResult]): Future[RevokeSecurityGroupIngressResult] = ???

  override def runInstancesAsync(runInstancesRequest: RunInstancesRequest): Future[RunInstancesResult] = ???

  override def runInstancesAsync(runInstancesRequest: RunInstancesRequest, asyncHandler: AsyncHandler[RunInstancesRequest, RunInstancesResult]): Future[RunInstancesResult] = ???

  override def runScheduledInstancesAsync(runScheduledInstancesRequest: RunScheduledInstancesRequest): Future[RunScheduledInstancesResult] = ???

  override def runScheduledInstancesAsync(runScheduledInstancesRequest: RunScheduledInstancesRequest, asyncHandler: AsyncHandler[RunScheduledInstancesRequest, RunScheduledInstancesResult]): Future[RunScheduledInstancesResult] = ???

  override def startInstancesAsync(startInstancesRequest: StartInstancesRequest): Future[StartInstancesResult] = ???

  override def startInstancesAsync(startInstancesRequest: StartInstancesRequest, asyncHandler: AsyncHandler[StartInstancesRequest, StartInstancesResult]): Future[StartInstancesResult] = ???

  override def stopInstancesAsync(stopInstancesRequest: StopInstancesRequest): Future[StopInstancesResult] = ???

  override def stopInstancesAsync(stopInstancesRequest: StopInstancesRequest, asyncHandler: AsyncHandler[StopInstancesRequest, StopInstancesResult]): Future[StopInstancesResult] = ???

  override def terminateInstancesAsync(terminateInstancesRequest: TerminateInstancesRequest): Future[TerminateInstancesResult] = ???

  override def terminateInstancesAsync(terminateInstancesRequest: TerminateInstancesRequest, asyncHandler: AsyncHandler[TerminateInstancesRequest, TerminateInstancesResult]): Future[TerminateInstancesResult] = ???

  override def unassignIpv6AddressesAsync(unassignIpv6AddressesRequest: UnassignIpv6AddressesRequest): Future[UnassignIpv6AddressesResult] = ???

  override def unassignIpv6AddressesAsync(unassignIpv6AddressesRequest: UnassignIpv6AddressesRequest, asyncHandler: AsyncHandler[UnassignIpv6AddressesRequest, UnassignIpv6AddressesResult]): Future[UnassignIpv6AddressesResult] = ???

  override def unassignPrivateIpAddressesAsync(unassignPrivateIpAddressesRequest: UnassignPrivateIpAddressesRequest): Future[UnassignPrivateIpAddressesResult] = ???

  override def unassignPrivateIpAddressesAsync(unassignPrivateIpAddressesRequest: UnassignPrivateIpAddressesRequest, asyncHandler: AsyncHandler[UnassignPrivateIpAddressesRequest, UnassignPrivateIpAddressesResult]): Future[UnassignPrivateIpAddressesResult] = ???

  override def unmonitorInstancesAsync(unmonitorInstancesRequest: UnmonitorInstancesRequest): Future[UnmonitorInstancesResult] = ???

  override def unmonitorInstancesAsync(unmonitorInstancesRequest: UnmonitorInstancesRequest, asyncHandler: AsyncHandler[UnmonitorInstancesRequest, UnmonitorInstancesResult]): Future[UnmonitorInstancesResult] = ???

  override def updateSecurityGroupRuleDescriptionsEgressAsync(updateSecurityGroupRuleDescriptionsEgressRequest: UpdateSecurityGroupRuleDescriptionsEgressRequest): Future[UpdateSecurityGroupRuleDescriptionsEgressResult] = ???

  override def updateSecurityGroupRuleDescriptionsEgressAsync(updateSecurityGroupRuleDescriptionsEgressRequest: UpdateSecurityGroupRuleDescriptionsEgressRequest, asyncHandler: AsyncHandler[UpdateSecurityGroupRuleDescriptionsEgressRequest, UpdateSecurityGroupRuleDescriptionsEgressResult]): Future[UpdateSecurityGroupRuleDescriptionsEgressResult] = ???

  override def updateSecurityGroupRuleDescriptionsIngressAsync(updateSecurityGroupRuleDescriptionsIngressRequest: UpdateSecurityGroupRuleDescriptionsIngressRequest): Future[UpdateSecurityGroupRuleDescriptionsIngressResult] = ???

  override def updateSecurityGroupRuleDescriptionsIngressAsync(updateSecurityGroupRuleDescriptionsIngressRequest: UpdateSecurityGroupRuleDescriptionsIngressRequest, asyncHandler: AsyncHandler[UpdateSecurityGroupRuleDescriptionsIngressRequest, UpdateSecurityGroupRuleDescriptionsIngressResult]): Future[UpdateSecurityGroupRuleDescriptionsIngressResult] = ???

  override def setEndpoint(endpoint: String): Unit = ???

  override def setRegion(region: Region): Unit = ???

  override def acceptReservedInstancesExchangeQuote(acceptReservedInstancesExchangeQuoteRequest: AcceptReservedInstancesExchangeQuoteRequest): AcceptReservedInstancesExchangeQuoteResult = ???

  override def acceptVpcEndpointConnections(acceptVpcEndpointConnectionsRequest: AcceptVpcEndpointConnectionsRequest): AcceptVpcEndpointConnectionsResult = ???

  override def acceptVpcPeeringConnection(acceptVpcPeeringConnectionRequest: AcceptVpcPeeringConnectionRequest): AcceptVpcPeeringConnectionResult = ???

  override def acceptVpcPeeringConnection(): AcceptVpcPeeringConnectionResult = ???

  override def allocateAddress(allocateAddressRequest: AllocateAddressRequest): AllocateAddressResult = ???

  override def allocateAddress(): AllocateAddressResult = ???

  override def allocateHosts(allocateHostsRequest: AllocateHostsRequest): AllocateHostsResult = ???

  override def assignIpv6Addresses(assignIpv6AddressesRequest: AssignIpv6AddressesRequest): AssignIpv6AddressesResult = ???

  override def assignPrivateIpAddresses(assignPrivateIpAddressesRequest: AssignPrivateIpAddressesRequest): AssignPrivateIpAddressesResult = ???

  override def associateAddress(associateAddressRequest: AssociateAddressRequest): AssociateAddressResult = ???

  override def associateDhcpOptions(associateDhcpOptionsRequest: AssociateDhcpOptionsRequest): AssociateDhcpOptionsResult = ???

  override def associateIamInstanceProfile(associateIamInstanceProfileRequest: AssociateIamInstanceProfileRequest): AssociateIamInstanceProfileResult = ???

  override def associateRouteTable(associateRouteTableRequest: AssociateRouteTableRequest): AssociateRouteTableResult = ???

  override def associateSubnetCidrBlock(associateSubnetCidrBlockRequest: AssociateSubnetCidrBlockRequest): AssociateSubnetCidrBlockResult = ???

  override def associateVpcCidrBlock(associateVpcCidrBlockRequest: AssociateVpcCidrBlockRequest): AssociateVpcCidrBlockResult = ???

  override def attachClassicLinkVpc(attachClassicLinkVpcRequest: AttachClassicLinkVpcRequest): AttachClassicLinkVpcResult = ???

  override def attachInternetGateway(attachInternetGatewayRequest: AttachInternetGatewayRequest): AttachInternetGatewayResult = ???

  override def attachNetworkInterface(attachNetworkInterfaceRequest: AttachNetworkInterfaceRequest): AttachNetworkInterfaceResult = ???

  override def attachVolume(attachVolumeRequest: AttachVolumeRequest): AttachVolumeResult = ???

  override def attachVpnGateway(attachVpnGatewayRequest: AttachVpnGatewayRequest): AttachVpnGatewayResult = ???

  override def authorizeSecurityGroupEgress(authorizeSecurityGroupEgressRequest: AuthorizeSecurityGroupEgressRequest): AuthorizeSecurityGroupEgressResult = ???

  override def authorizeSecurityGroupIngress(authorizeSecurityGroupIngressRequest: AuthorizeSecurityGroupIngressRequest): AuthorizeSecurityGroupIngressResult = ???

  override def bundleInstance(bundleInstanceRequest: BundleInstanceRequest): BundleInstanceResult = ???

  override def cancelBundleTask(cancelBundleTaskRequest: CancelBundleTaskRequest): CancelBundleTaskResult = ???

  override def cancelConversionTask(cancelConversionTaskRequest: CancelConversionTaskRequest): CancelConversionTaskResult = ???

  override def cancelExportTask(cancelExportTaskRequest: CancelExportTaskRequest): CancelExportTaskResult = ???

  override def cancelImportTask(cancelImportTaskRequest: CancelImportTaskRequest): CancelImportTaskResult = ???

  override def cancelImportTask(): CancelImportTaskResult = ???

  override def cancelReservedInstancesListing(cancelReservedInstancesListingRequest: CancelReservedInstancesListingRequest): CancelReservedInstancesListingResult = ???

  override def cancelSpotFleetRequests(cancelSpotFleetRequestsRequest: CancelSpotFleetRequestsRequest): CancelSpotFleetRequestsResult = ???

  override def cancelSpotInstanceRequests(cancelSpotInstanceRequestsRequest: CancelSpotInstanceRequestsRequest): CancelSpotInstanceRequestsResult = ???

  override def confirmProductInstance(confirmProductInstanceRequest: ConfirmProductInstanceRequest): ConfirmProductInstanceResult = ???

  override def copyFpgaImage(copyFpgaImageRequest: CopyFpgaImageRequest): CopyFpgaImageResult = ???

  override def copyImage(copyImageRequest: CopyImageRequest): CopyImageResult = ???

  override def copySnapshot(copySnapshotRequest: CopySnapshotRequest): CopySnapshotResult = ???

  override def createCustomerGateway(createCustomerGatewayRequest: CreateCustomerGatewayRequest): CreateCustomerGatewayResult = ???

  override def createDefaultSubnet(createDefaultSubnetRequest: CreateDefaultSubnetRequest): CreateDefaultSubnetResult = ???

  override def createDefaultVpc(createDefaultVpcRequest: CreateDefaultVpcRequest): CreateDefaultVpcResult = ???

  override def createDhcpOptions(createDhcpOptionsRequest: CreateDhcpOptionsRequest): CreateDhcpOptionsResult = ???

  override def createEgressOnlyInternetGateway(createEgressOnlyInternetGatewayRequest: CreateEgressOnlyInternetGatewayRequest): CreateEgressOnlyInternetGatewayResult = ???

  override def createFleet(createFleetRequest: CreateFleetRequest): CreateFleetResult = ???

  override def createFlowLogs(createFlowLogsRequest: CreateFlowLogsRequest): CreateFlowLogsResult = ???

  override def createFpgaImage(createFpgaImageRequest: CreateFpgaImageRequest): CreateFpgaImageResult = ???

  override def createImage(createImageRequest: CreateImageRequest): CreateImageResult = ???

  override def createInstanceExportTask(createInstanceExportTaskRequest: CreateInstanceExportTaskRequest): CreateInstanceExportTaskResult = ???

  override def createInternetGateway(createInternetGatewayRequest: CreateInternetGatewayRequest): CreateInternetGatewayResult = ???

  override def createInternetGateway(): CreateInternetGatewayResult = ???

  override def createKeyPair(createKeyPairRequest: CreateKeyPairRequest): CreateKeyPairResult = ???

  override def createLaunchTemplate(createLaunchTemplateRequest: CreateLaunchTemplateRequest): CreateLaunchTemplateResult = ???

  override def createLaunchTemplateVersion(createLaunchTemplateVersionRequest: CreateLaunchTemplateVersionRequest): CreateLaunchTemplateVersionResult = ???

  override def createNatGateway(createNatGatewayRequest: CreateNatGatewayRequest): CreateNatGatewayResult = ???

  override def createNetworkAcl(createNetworkAclRequest: CreateNetworkAclRequest): CreateNetworkAclResult = ???

  override def createNetworkAclEntry(createNetworkAclEntryRequest: CreateNetworkAclEntryRequest): CreateNetworkAclEntryResult = ???

  override def createNetworkInterface(createNetworkInterfaceRequest: CreateNetworkInterfaceRequest): CreateNetworkInterfaceResult = ???

  override def createNetworkInterfacePermission(createNetworkInterfacePermissionRequest: CreateNetworkInterfacePermissionRequest): CreateNetworkInterfacePermissionResult = ???

  override def createPlacementGroup(createPlacementGroupRequest: CreatePlacementGroupRequest): CreatePlacementGroupResult = ???

  override def createReservedInstancesListing(createReservedInstancesListingRequest: CreateReservedInstancesListingRequest): CreateReservedInstancesListingResult = ???

  override def createRoute(createRouteRequest: CreateRouteRequest): CreateRouteResult = ???

  override def createRouteTable(createRouteTableRequest: CreateRouteTableRequest): CreateRouteTableResult = ???

  override def createSecurityGroup(createSecurityGroupRequest: CreateSecurityGroupRequest): CreateSecurityGroupResult = ???

  override def createSnapshot(createSnapshotRequest: CreateSnapshotRequest): CreateSnapshotResult = ???

  override def createSpotDatafeedSubscription(createSpotDatafeedSubscriptionRequest: CreateSpotDatafeedSubscriptionRequest): CreateSpotDatafeedSubscriptionResult = ???

  override def createSubnet(createSubnetRequest: CreateSubnetRequest): CreateSubnetResult = ???

  override def createTags(createTagsRequest: CreateTagsRequest): CreateTagsResult = ???

  override def createVolume(createVolumeRequest: CreateVolumeRequest): CreateVolumeResult = ???

  override def createVpc(createVpcRequest: CreateVpcRequest): CreateVpcResult = ???

  override def createVpcEndpoint(createVpcEndpointRequest: CreateVpcEndpointRequest): CreateVpcEndpointResult = ???

  override def createVpcEndpointConnectionNotification(createVpcEndpointConnectionNotificationRequest: CreateVpcEndpointConnectionNotificationRequest): CreateVpcEndpointConnectionNotificationResult = ???

  override def createVpcEndpointServiceConfiguration(createVpcEndpointServiceConfigurationRequest: CreateVpcEndpointServiceConfigurationRequest): CreateVpcEndpointServiceConfigurationResult = ???

  override def createVpcPeeringConnection(createVpcPeeringConnectionRequest: CreateVpcPeeringConnectionRequest): CreateVpcPeeringConnectionResult = ???

  override def createVpcPeeringConnection(): CreateVpcPeeringConnectionResult = ???

  override def createVpnConnection(createVpnConnectionRequest: CreateVpnConnectionRequest): CreateVpnConnectionResult = ???

  override def createVpnConnectionRoute(createVpnConnectionRouteRequest: CreateVpnConnectionRouteRequest): CreateVpnConnectionRouteResult = ???

  override def createVpnGateway(createVpnGatewayRequest: CreateVpnGatewayRequest): CreateVpnGatewayResult = ???

  override def deleteCustomerGateway(deleteCustomerGatewayRequest: DeleteCustomerGatewayRequest): DeleteCustomerGatewayResult = ???

  override def deleteDhcpOptions(deleteDhcpOptionsRequest: DeleteDhcpOptionsRequest): DeleteDhcpOptionsResult = ???

  override def deleteEgressOnlyInternetGateway(deleteEgressOnlyInternetGatewayRequest: DeleteEgressOnlyInternetGatewayRequest): DeleteEgressOnlyInternetGatewayResult = ???

  override def deleteFleets(deleteFleetsRequest: DeleteFleetsRequest): DeleteFleetsResult = ???

  override def deleteFlowLogs(deleteFlowLogsRequest: DeleteFlowLogsRequest): DeleteFlowLogsResult = ???

  override def deleteFpgaImage(deleteFpgaImageRequest: DeleteFpgaImageRequest): DeleteFpgaImageResult = ???

  override def deleteInternetGateway(deleteInternetGatewayRequest: DeleteInternetGatewayRequest): DeleteInternetGatewayResult = ???

  override def deleteKeyPair(deleteKeyPairRequest: DeleteKeyPairRequest): DeleteKeyPairResult = ???

  override def deleteLaunchTemplate(deleteLaunchTemplateRequest: DeleteLaunchTemplateRequest): DeleteLaunchTemplateResult = ???

  override def deleteLaunchTemplateVersions(deleteLaunchTemplateVersionsRequest: DeleteLaunchTemplateVersionsRequest): DeleteLaunchTemplateVersionsResult = ???

  override def deleteNatGateway(deleteNatGatewayRequest: DeleteNatGatewayRequest): DeleteNatGatewayResult = ???

  override def deleteNetworkAcl(deleteNetworkAclRequest: DeleteNetworkAclRequest): DeleteNetworkAclResult = ???

  override def deleteNetworkAclEntry(deleteNetworkAclEntryRequest: DeleteNetworkAclEntryRequest): DeleteNetworkAclEntryResult = ???

  override def deleteNetworkInterface(deleteNetworkInterfaceRequest: DeleteNetworkInterfaceRequest): DeleteNetworkInterfaceResult = ???

  override def deleteNetworkInterfacePermission(deleteNetworkInterfacePermissionRequest: DeleteNetworkInterfacePermissionRequest): DeleteNetworkInterfacePermissionResult = ???

  override def deletePlacementGroup(deletePlacementGroupRequest: DeletePlacementGroupRequest): DeletePlacementGroupResult = ???

  override def deleteRoute(deleteRouteRequest: DeleteRouteRequest): DeleteRouteResult = ???

  override def deleteRouteTable(deleteRouteTableRequest: DeleteRouteTableRequest): DeleteRouteTableResult = ???

  override def deleteSecurityGroup(deleteSecurityGroupRequest: DeleteSecurityGroupRequest): DeleteSecurityGroupResult = ???

  override def deleteSnapshot(deleteSnapshotRequest: DeleteSnapshotRequest): DeleteSnapshotResult = ???

  override def deleteSpotDatafeedSubscription(deleteSpotDatafeedSubscriptionRequest: DeleteSpotDatafeedSubscriptionRequest): DeleteSpotDatafeedSubscriptionResult = ???

  override def deleteSpotDatafeedSubscription(): DeleteSpotDatafeedSubscriptionResult = ???

  override def deleteSubnet(deleteSubnetRequest: DeleteSubnetRequest): DeleteSubnetResult = ???

  override def deleteTags(deleteTagsRequest: DeleteTagsRequest): DeleteTagsResult = ???

  override def deleteVolume(deleteVolumeRequest: DeleteVolumeRequest): DeleteVolumeResult = ???

  override def deleteVpc(deleteVpcRequest: DeleteVpcRequest): DeleteVpcResult = ???

  override def deleteVpcEndpointConnectionNotifications(deleteVpcEndpointConnectionNotificationsRequest: DeleteVpcEndpointConnectionNotificationsRequest): DeleteVpcEndpointConnectionNotificationsResult = ???

  override def deleteVpcEndpointServiceConfigurations(deleteVpcEndpointServiceConfigurationsRequest: DeleteVpcEndpointServiceConfigurationsRequest): DeleteVpcEndpointServiceConfigurationsResult = ???

  override def deleteVpcEndpoints(deleteVpcEndpointsRequest: DeleteVpcEndpointsRequest): DeleteVpcEndpointsResult = ???

  override def deleteVpcPeeringConnection(deleteVpcPeeringConnectionRequest: DeleteVpcPeeringConnectionRequest): DeleteVpcPeeringConnectionResult = ???

  override def deleteVpnConnection(deleteVpnConnectionRequest: DeleteVpnConnectionRequest): DeleteVpnConnectionResult = ???

  override def deleteVpnConnectionRoute(deleteVpnConnectionRouteRequest: DeleteVpnConnectionRouteRequest): DeleteVpnConnectionRouteResult = ???

  override def deleteVpnGateway(deleteVpnGatewayRequest: DeleteVpnGatewayRequest): DeleteVpnGatewayResult = ???

  override def deregisterImage(deregisterImageRequest: DeregisterImageRequest): DeregisterImageResult = ???

  override def describeAccountAttributes(describeAccountAttributesRequest: DescribeAccountAttributesRequest): DescribeAccountAttributesResult = ???

  override def describeAccountAttributes(): DescribeAccountAttributesResult = ???

  override def describeAddresses(describeAddressesRequest: DescribeAddressesRequest): DescribeAddressesResult = ???

  override def describeAddresses(): DescribeAddressesResult = ???

  override def describeAggregateIdFormat(describeAggregateIdFormatRequest: DescribeAggregateIdFormatRequest): DescribeAggregateIdFormatResult = ???

  override def describeAvailabilityZones(describeAvailabilityZonesRequest: DescribeAvailabilityZonesRequest): DescribeAvailabilityZonesResult = ???

  override def describeAvailabilityZones(): DescribeAvailabilityZonesResult = ???

  override def describeBundleTasks(describeBundleTasksRequest: DescribeBundleTasksRequest): DescribeBundleTasksResult = ???

  override def describeBundleTasks(): DescribeBundleTasksResult = ???

  override def describeClassicLinkInstances(describeClassicLinkInstancesRequest: DescribeClassicLinkInstancesRequest): DescribeClassicLinkInstancesResult = ???

  override def describeClassicLinkInstances(): DescribeClassicLinkInstancesResult = ???

  override def describeConversionTasks(describeConversionTasksRequest: DescribeConversionTasksRequest): DescribeConversionTasksResult = ???

  override def describeConversionTasks(): DescribeConversionTasksResult = ???

  override def describeCustomerGateways(describeCustomerGatewaysRequest: DescribeCustomerGatewaysRequest): DescribeCustomerGatewaysResult = ???

  override def describeCustomerGateways(): DescribeCustomerGatewaysResult = ???

  override def describeDhcpOptions(describeDhcpOptionsRequest: DescribeDhcpOptionsRequest): DescribeDhcpOptionsResult = ???

  override def describeDhcpOptions(): DescribeDhcpOptionsResult = ???

  override def describeEgressOnlyInternetGateways(describeEgressOnlyInternetGatewaysRequest: DescribeEgressOnlyInternetGatewaysRequest): DescribeEgressOnlyInternetGatewaysResult = ???

  override def describeElasticGpus(describeElasticGpusRequest: DescribeElasticGpusRequest): DescribeElasticGpusResult = ???

  override def describeExportTasks(describeExportTasksRequest: DescribeExportTasksRequest): DescribeExportTasksResult = ???

  override def describeExportTasks(): DescribeExportTasksResult = ???

  override def describeFleetHistory(describeFleetHistoryRequest: DescribeFleetHistoryRequest): DescribeFleetHistoryResult = ???

  override def describeFleetInstances(describeFleetInstancesRequest: DescribeFleetInstancesRequest): DescribeFleetInstancesResult = ???

  override def describeFleets(describeFleetsRequest: DescribeFleetsRequest): DescribeFleetsResult = ???

  override def describeFlowLogs(describeFlowLogsRequest: DescribeFlowLogsRequest): DescribeFlowLogsResult = ???

  override def describeFlowLogs(): DescribeFlowLogsResult = ???

  override def describeFpgaImageAttribute(describeFpgaImageAttributeRequest: DescribeFpgaImageAttributeRequest): DescribeFpgaImageAttributeResult = ???

  override def describeFpgaImages(describeFpgaImagesRequest: DescribeFpgaImagesRequest): DescribeFpgaImagesResult = ???

  override def describeHostReservationOfferings(describeHostReservationOfferingsRequest: DescribeHostReservationOfferingsRequest): DescribeHostReservationOfferingsResult = ???

  override def describeHostReservations(describeHostReservationsRequest: DescribeHostReservationsRequest): DescribeHostReservationsResult = ???

  override def describeHosts(describeHostsRequest: DescribeHostsRequest): DescribeHostsResult = ???

  override def describeHosts(): DescribeHostsResult = ???

  override def describeIamInstanceProfileAssociations(describeIamInstanceProfileAssociationsRequest: DescribeIamInstanceProfileAssociationsRequest): DescribeIamInstanceProfileAssociationsResult = ???

  override def describeIdFormat(describeIdFormatRequest: DescribeIdFormatRequest): DescribeIdFormatResult = ???

  override def describeIdFormat(): DescribeIdFormatResult = ???

  override def describeIdentityIdFormat(describeIdentityIdFormatRequest: DescribeIdentityIdFormatRequest): DescribeIdentityIdFormatResult = ???

  override def describeImageAttribute(describeImageAttributeRequest: DescribeImageAttributeRequest): DescribeImageAttributeResult = ???

  override def describeImages(describeImagesRequest: DescribeImagesRequest): DescribeImagesResult = ???

  override def describeImages(): DescribeImagesResult = ???

  override def describeImportImageTasks(describeImportImageTasksRequest: DescribeImportImageTasksRequest): DescribeImportImageTasksResult = ???

  override def describeImportImageTasks(): DescribeImportImageTasksResult = ???

  override def describeImportSnapshotTasks(describeImportSnapshotTasksRequest: DescribeImportSnapshotTasksRequest): DescribeImportSnapshotTasksResult = ???

  override def describeImportSnapshotTasks(): DescribeImportSnapshotTasksResult = ???

  override def describeInstanceAttribute(describeInstanceAttributeRequest: DescribeInstanceAttributeRequest): DescribeInstanceAttributeResult = ???

  override def describeInstanceCreditSpecifications(describeInstanceCreditSpecificationsRequest: DescribeInstanceCreditSpecificationsRequest): DescribeInstanceCreditSpecificationsResult = ???

  override def describeInstanceStatus(describeInstanceStatusRequest: DescribeInstanceStatusRequest): DescribeInstanceStatusResult = ???

  override def describeInstanceStatus(): DescribeInstanceStatusResult = ???

  override def describeInstances(describeInstancesRequest: DescribeInstancesRequest): DescribeInstancesResult = ???

  override def describeInstances(): DescribeInstancesResult = ???

  override def describeInternetGateways(describeInternetGatewaysRequest: DescribeInternetGatewaysRequest): DescribeInternetGatewaysResult = ???

  override def describeInternetGateways(): DescribeInternetGatewaysResult = ???

  override def describeKeyPairs(describeKeyPairsRequest: DescribeKeyPairsRequest): DescribeKeyPairsResult = ???

  override def describeKeyPairs(): DescribeKeyPairsResult = ???

  override def describeLaunchTemplateVersions(describeLaunchTemplateVersionsRequest: DescribeLaunchTemplateVersionsRequest): DescribeLaunchTemplateVersionsResult = ???

  override def describeLaunchTemplates(describeLaunchTemplatesRequest: DescribeLaunchTemplatesRequest): DescribeLaunchTemplatesResult = ???

  override def describeMovingAddresses(describeMovingAddressesRequest: DescribeMovingAddressesRequest): DescribeMovingAddressesResult = ???

  override def describeMovingAddresses(): DescribeMovingAddressesResult = ???

  override def describeNatGateways(describeNatGatewaysRequest: DescribeNatGatewaysRequest): DescribeNatGatewaysResult = ???

  override def describeNetworkAcls(describeNetworkAclsRequest: DescribeNetworkAclsRequest): DescribeNetworkAclsResult = ???

  override def describeNetworkAcls(): DescribeNetworkAclsResult = ???

  override def describeNetworkInterfaceAttribute(describeNetworkInterfaceAttributeRequest: DescribeNetworkInterfaceAttributeRequest): DescribeNetworkInterfaceAttributeResult = ???

  override def describeNetworkInterfacePermissions(describeNetworkInterfacePermissionsRequest: DescribeNetworkInterfacePermissionsRequest): DescribeNetworkInterfacePermissionsResult = ???

  override def describeNetworkInterfaces(describeNetworkInterfacesRequest: DescribeNetworkInterfacesRequest): DescribeNetworkInterfacesResult = ???

  override def describeNetworkInterfaces(): DescribeNetworkInterfacesResult = ???

  override def describePlacementGroups(describePlacementGroupsRequest: DescribePlacementGroupsRequest): DescribePlacementGroupsResult = ???

  override def describePlacementGroups(): DescribePlacementGroupsResult = ???

  override def describePrefixLists(describePrefixListsRequest: DescribePrefixListsRequest): DescribePrefixListsResult = ???

  override def describePrefixLists(): DescribePrefixListsResult = ???

  override def describePrincipalIdFormat(describePrincipalIdFormatRequest: DescribePrincipalIdFormatRequest): DescribePrincipalIdFormatResult = ???

  override def describeRegions(describeRegionsRequest: DescribeRegionsRequest): DescribeRegionsResult = ???

  override def describeRegions(): DescribeRegionsResult = ???

  override def describeReservedInstances(describeReservedInstancesRequest: DescribeReservedInstancesRequest): DescribeReservedInstancesResult = ???

  override def describeReservedInstances(): DescribeReservedInstancesResult = ???

  override def describeReservedInstancesListings(describeReservedInstancesListingsRequest: DescribeReservedInstancesListingsRequest): DescribeReservedInstancesListingsResult = ???

  override def describeReservedInstancesListings(): DescribeReservedInstancesListingsResult = ???

  override def describeReservedInstancesModifications(describeReservedInstancesModificationsRequest: DescribeReservedInstancesModificationsRequest): DescribeReservedInstancesModificationsResult = ???

  override def describeReservedInstancesModifications(): DescribeReservedInstancesModificationsResult = ???

  override def describeReservedInstancesOfferings(describeReservedInstancesOfferingsRequest: DescribeReservedInstancesOfferingsRequest): DescribeReservedInstancesOfferingsResult = ???

  override def describeReservedInstancesOfferings(): DescribeReservedInstancesOfferingsResult = ???

  override def describeRouteTables(describeRouteTablesRequest: DescribeRouteTablesRequest): DescribeRouteTablesResult = ???

  override def describeRouteTables(): DescribeRouteTablesResult = ???

  override def describeScheduledInstanceAvailability(describeScheduledInstanceAvailabilityRequest: DescribeScheduledInstanceAvailabilityRequest): DescribeScheduledInstanceAvailabilityResult = ???

  override def describeScheduledInstances(describeScheduledInstancesRequest: DescribeScheduledInstancesRequest): DescribeScheduledInstancesResult = ???

  override def describeSecurityGroupReferences(describeSecurityGroupReferencesRequest: DescribeSecurityGroupReferencesRequest): DescribeSecurityGroupReferencesResult = ???

  override def describeSecurityGroups(describeSecurityGroupsRequest: DescribeSecurityGroupsRequest): DescribeSecurityGroupsResult = ???

  override def describeSecurityGroups(): DescribeSecurityGroupsResult = ???

  override def describeSnapshotAttribute(describeSnapshotAttributeRequest: DescribeSnapshotAttributeRequest): DescribeSnapshotAttributeResult = ???

  override def describeSnapshots(describeSnapshotsRequest: DescribeSnapshotsRequest): DescribeSnapshotsResult = ???

  override def describeSnapshots(): DescribeSnapshotsResult = ???

  override def describeSpotDatafeedSubscription(describeSpotDatafeedSubscriptionRequest: DescribeSpotDatafeedSubscriptionRequest): DescribeSpotDatafeedSubscriptionResult = ???

  override def describeSpotDatafeedSubscription(): DescribeSpotDatafeedSubscriptionResult = ???

  override def describeSpotFleetInstances(describeSpotFleetInstancesRequest: DescribeSpotFleetInstancesRequest): DescribeSpotFleetInstancesResult = ???

  override def describeSpotFleetRequestHistory(describeSpotFleetRequestHistoryRequest: DescribeSpotFleetRequestHistoryRequest): DescribeSpotFleetRequestHistoryResult = ???

  override def describeSpotFleetRequests(describeSpotFleetRequestsRequest: DescribeSpotFleetRequestsRequest): DescribeSpotFleetRequestsResult = ???

  override def describeSpotFleetRequests(): DescribeSpotFleetRequestsResult = ???

  override def describeSpotInstanceRequests(describeSpotInstanceRequestsRequest: DescribeSpotInstanceRequestsRequest): DescribeSpotInstanceRequestsResult = ???

  override def describeSpotInstanceRequests(): DescribeSpotInstanceRequestsResult = ???

  override def describeSpotPriceHistory(describeSpotPriceHistoryRequest: DescribeSpotPriceHistoryRequest): DescribeSpotPriceHistoryResult = ???

  override def describeSpotPriceHistory(): DescribeSpotPriceHistoryResult = ???

  override def describeStaleSecurityGroups(describeStaleSecurityGroupsRequest: DescribeStaleSecurityGroupsRequest): DescribeStaleSecurityGroupsResult = ???

  override def describeSubnets(describeSubnetsRequest: DescribeSubnetsRequest): DescribeSubnetsResult = ???

  override def describeSubnets(): DescribeSubnetsResult = ???

  override def describeTags(describeTagsRequest: DescribeTagsRequest): DescribeTagsResult = ???

  override def describeTags(): DescribeTagsResult = ???

  override def describeVolumeAttribute(describeVolumeAttributeRequest: DescribeVolumeAttributeRequest): DescribeVolumeAttributeResult = ???

  override def describeVolumeStatus(describeVolumeStatusRequest: DescribeVolumeStatusRequest): DescribeVolumeStatusResult = ???

  override def describeVolumeStatus(): DescribeVolumeStatusResult = ???

  override def describeVolumes(describeVolumesRequest: DescribeVolumesRequest): DescribeVolumesResult = ???

  override def describeVolumes(): DescribeVolumesResult = ???

  override def describeVolumesModifications(describeVolumesModificationsRequest: DescribeVolumesModificationsRequest): DescribeVolumesModificationsResult = ???

  override def describeVpcAttribute(describeVpcAttributeRequest: DescribeVpcAttributeRequest): DescribeVpcAttributeResult = ???

  override def describeVpcClassicLink(describeVpcClassicLinkRequest: DescribeVpcClassicLinkRequest): DescribeVpcClassicLinkResult = ???

  override def describeVpcClassicLink(): DescribeVpcClassicLinkResult = ???

  override def describeVpcClassicLinkDnsSupport(describeVpcClassicLinkDnsSupportRequest: DescribeVpcClassicLinkDnsSupportRequest): DescribeVpcClassicLinkDnsSupportResult = ???

  override def describeVpcEndpointConnectionNotifications(describeVpcEndpointConnectionNotificationsRequest: DescribeVpcEndpointConnectionNotificationsRequest): DescribeVpcEndpointConnectionNotificationsResult = ???

  override def describeVpcEndpointConnections(describeVpcEndpointConnectionsRequest: DescribeVpcEndpointConnectionsRequest): DescribeVpcEndpointConnectionsResult = ???

  override def describeVpcEndpointServiceConfigurations(describeVpcEndpointServiceConfigurationsRequest: DescribeVpcEndpointServiceConfigurationsRequest): DescribeVpcEndpointServiceConfigurationsResult = ???

  override def describeVpcEndpointServicePermissions(describeVpcEndpointServicePermissionsRequest: DescribeVpcEndpointServicePermissionsRequest): DescribeVpcEndpointServicePermissionsResult = ???

  override def describeVpcEndpointServices(describeVpcEndpointServicesRequest: DescribeVpcEndpointServicesRequest): DescribeVpcEndpointServicesResult = ???

  override def describeVpcEndpointServices(): DescribeVpcEndpointServicesResult = ???

  override def describeVpcEndpoints(describeVpcEndpointsRequest: DescribeVpcEndpointsRequest): DescribeVpcEndpointsResult = ???

  override def describeVpcEndpoints(): DescribeVpcEndpointsResult = ???

  override def describeVpcPeeringConnections(describeVpcPeeringConnectionsRequest: DescribeVpcPeeringConnectionsRequest): DescribeVpcPeeringConnectionsResult = ???

  override def describeVpcPeeringConnections(): DescribeVpcPeeringConnectionsResult = ???

  override def describeVpcs(describeVpcsRequest: DescribeVpcsRequest): DescribeVpcsResult = ???

  override def describeVpcs(): DescribeVpcsResult = ???

  override def describeVpnConnections(describeVpnConnectionsRequest: DescribeVpnConnectionsRequest): DescribeVpnConnectionsResult = ???

  override def describeVpnConnections(): DescribeVpnConnectionsResult = ???

  override def describeVpnGateways(describeVpnGatewaysRequest: DescribeVpnGatewaysRequest): DescribeVpnGatewaysResult = ???

  override def describeVpnGateways(): DescribeVpnGatewaysResult = ???

  override def detachClassicLinkVpc(detachClassicLinkVpcRequest: DetachClassicLinkVpcRequest): DetachClassicLinkVpcResult = ???

  override def detachInternetGateway(detachInternetGatewayRequest: DetachInternetGatewayRequest): DetachInternetGatewayResult = ???

  override def detachNetworkInterface(detachNetworkInterfaceRequest: DetachNetworkInterfaceRequest): DetachNetworkInterfaceResult = ???

  override def detachVolume(detachVolumeRequest: DetachVolumeRequest): DetachVolumeResult = ???

  override def detachVpnGateway(detachVpnGatewayRequest: DetachVpnGatewayRequest): DetachVpnGatewayResult = ???

  override def disableVgwRoutePropagation(disableVgwRoutePropagationRequest: DisableVgwRoutePropagationRequest): DisableVgwRoutePropagationResult = ???

  override def disableVpcClassicLink(disableVpcClassicLinkRequest: DisableVpcClassicLinkRequest): DisableVpcClassicLinkResult = ???

  override def disableVpcClassicLinkDnsSupport(disableVpcClassicLinkDnsSupportRequest: DisableVpcClassicLinkDnsSupportRequest): DisableVpcClassicLinkDnsSupportResult = ???

  override def disassociateAddress(disassociateAddressRequest: DisassociateAddressRequest): DisassociateAddressResult = ???

  override def disassociateIamInstanceProfile(disassociateIamInstanceProfileRequest: DisassociateIamInstanceProfileRequest): DisassociateIamInstanceProfileResult = ???

  override def disassociateRouteTable(disassociateRouteTableRequest: DisassociateRouteTableRequest): DisassociateRouteTableResult = ???

  override def disassociateSubnetCidrBlock(disassociateSubnetCidrBlockRequest: DisassociateSubnetCidrBlockRequest): DisassociateSubnetCidrBlockResult = ???

  override def disassociateVpcCidrBlock(disassociateVpcCidrBlockRequest: DisassociateVpcCidrBlockRequest): DisassociateVpcCidrBlockResult = ???

  override def enableVgwRoutePropagation(enableVgwRoutePropagationRequest: EnableVgwRoutePropagationRequest): EnableVgwRoutePropagationResult = ???

  override def enableVolumeIO(enableVolumeIORequest: EnableVolumeIORequest): EnableVolumeIOResult = ???

  override def enableVpcClassicLink(enableVpcClassicLinkRequest: EnableVpcClassicLinkRequest): EnableVpcClassicLinkResult = ???

  override def enableVpcClassicLinkDnsSupport(enableVpcClassicLinkDnsSupportRequest: EnableVpcClassicLinkDnsSupportRequest): EnableVpcClassicLinkDnsSupportResult = ???

  override def getConsoleOutput(getConsoleOutputRequest: GetConsoleOutputRequest): GetConsoleOutputResult = ???

  override def getConsoleScreenshot(getConsoleScreenshotRequest: GetConsoleScreenshotRequest): GetConsoleScreenshotResult = ???

  override def getHostReservationPurchasePreview(getHostReservationPurchasePreviewRequest: GetHostReservationPurchasePreviewRequest): GetHostReservationPurchasePreviewResult = ???

  override def getLaunchTemplateData(getLaunchTemplateDataRequest: GetLaunchTemplateDataRequest): GetLaunchTemplateDataResult = ???

  override def getPasswordData(getPasswordDataRequest: GetPasswordDataRequest): GetPasswordDataResult = ???

  override def getReservedInstancesExchangeQuote(getReservedInstancesExchangeQuoteRequest: GetReservedInstancesExchangeQuoteRequest): GetReservedInstancesExchangeQuoteResult = ???

  override def importImage(importImageRequest: ImportImageRequest): ImportImageResult = ???

  override def importImage(): ImportImageResult = ???

  override def importInstance(importInstanceRequest: ImportInstanceRequest): ImportInstanceResult = ???

  override def importKeyPair(importKeyPairRequest: ImportKeyPairRequest): ImportKeyPairResult = ???

  override def importSnapshot(importSnapshotRequest: ImportSnapshotRequest): ImportSnapshotResult = ???

  override def importSnapshot(): ImportSnapshotResult = ???

  override def importVolume(importVolumeRequest: ImportVolumeRequest): ImportVolumeResult = ???

  override def modifyFleet(modifyFleetRequest: ModifyFleetRequest): ModifyFleetResult = ???

  override def modifyFpgaImageAttribute(modifyFpgaImageAttributeRequest: ModifyFpgaImageAttributeRequest): ModifyFpgaImageAttributeResult = ???

  override def modifyHosts(modifyHostsRequest: ModifyHostsRequest): ModifyHostsResult = ???

  override def modifyIdFormat(modifyIdFormatRequest: ModifyIdFormatRequest): ModifyIdFormatResult = ???

  override def modifyIdentityIdFormat(modifyIdentityIdFormatRequest: ModifyIdentityIdFormatRequest): ModifyIdentityIdFormatResult = ???

  override def modifyImageAttribute(modifyImageAttributeRequest: ModifyImageAttributeRequest): ModifyImageAttributeResult = ???

  override def modifyInstanceAttribute(modifyInstanceAttributeRequest: ModifyInstanceAttributeRequest): ModifyInstanceAttributeResult = ???

  override def modifyInstanceCreditSpecification(modifyInstanceCreditSpecificationRequest: ModifyInstanceCreditSpecificationRequest): ModifyInstanceCreditSpecificationResult = ???

  override def modifyInstancePlacement(modifyInstancePlacementRequest: ModifyInstancePlacementRequest): ModifyInstancePlacementResult = ???

  override def modifyLaunchTemplate(modifyLaunchTemplateRequest: ModifyLaunchTemplateRequest): ModifyLaunchTemplateResult = ???

  override def modifyNetworkInterfaceAttribute(modifyNetworkInterfaceAttributeRequest: ModifyNetworkInterfaceAttributeRequest): ModifyNetworkInterfaceAttributeResult = ???

  override def modifyReservedInstances(modifyReservedInstancesRequest: ModifyReservedInstancesRequest): ModifyReservedInstancesResult = ???

  override def modifySnapshotAttribute(modifySnapshotAttributeRequest: ModifySnapshotAttributeRequest): ModifySnapshotAttributeResult = ???

  override def modifySpotFleetRequest(modifySpotFleetRequestRequest: ModifySpotFleetRequestRequest): ModifySpotFleetRequestResult = ???

  override def modifySubnetAttribute(modifySubnetAttributeRequest: ModifySubnetAttributeRequest): ModifySubnetAttributeResult = ???

  override def modifyVolume(modifyVolumeRequest: ModifyVolumeRequest): ModifyVolumeResult = ???

  override def modifyVolumeAttribute(modifyVolumeAttributeRequest: ModifyVolumeAttributeRequest): ModifyVolumeAttributeResult = ???

  override def modifyVpcAttribute(modifyVpcAttributeRequest: ModifyVpcAttributeRequest): ModifyVpcAttributeResult = ???

  override def modifyVpcEndpoint(modifyVpcEndpointRequest: ModifyVpcEndpointRequest): ModifyVpcEndpointResult = ???

  override def modifyVpcEndpointConnectionNotification(modifyVpcEndpointConnectionNotificationRequest: ModifyVpcEndpointConnectionNotificationRequest): ModifyVpcEndpointConnectionNotificationResult = ???

  override def modifyVpcEndpointServiceConfiguration(modifyVpcEndpointServiceConfigurationRequest: ModifyVpcEndpointServiceConfigurationRequest): ModifyVpcEndpointServiceConfigurationResult = ???

  override def modifyVpcEndpointServicePermissions(modifyVpcEndpointServicePermissionsRequest: ModifyVpcEndpointServicePermissionsRequest): ModifyVpcEndpointServicePermissionsResult = ???

  override def modifyVpcPeeringConnectionOptions(modifyVpcPeeringConnectionOptionsRequest: ModifyVpcPeeringConnectionOptionsRequest): ModifyVpcPeeringConnectionOptionsResult = ???

  override def modifyVpcTenancy(modifyVpcTenancyRequest: ModifyVpcTenancyRequest): ModifyVpcTenancyResult = ???

  override def monitorInstances(monitorInstancesRequest: MonitorInstancesRequest): MonitorInstancesResult = ???

  override def moveAddressToVpc(moveAddressToVpcRequest: MoveAddressToVpcRequest): MoveAddressToVpcResult = ???

  override def purchaseHostReservation(purchaseHostReservationRequest: PurchaseHostReservationRequest): PurchaseHostReservationResult = ???

  override def purchaseReservedInstancesOffering(purchaseReservedInstancesOfferingRequest: PurchaseReservedInstancesOfferingRequest): PurchaseReservedInstancesOfferingResult = ???

  override def purchaseScheduledInstances(purchaseScheduledInstancesRequest: PurchaseScheduledInstancesRequest): PurchaseScheduledInstancesResult = ???

  override def rebootInstances(rebootInstancesRequest: RebootInstancesRequest): RebootInstancesResult = ???

  override def registerImage(registerImageRequest: RegisterImageRequest): RegisterImageResult = ???

  override def rejectVpcEndpointConnections(rejectVpcEndpointConnectionsRequest: RejectVpcEndpointConnectionsRequest): RejectVpcEndpointConnectionsResult = ???

  override def rejectVpcPeeringConnection(rejectVpcPeeringConnectionRequest: RejectVpcPeeringConnectionRequest): RejectVpcPeeringConnectionResult = ???

  override def releaseAddress(releaseAddressRequest: ReleaseAddressRequest): ReleaseAddressResult = ???

  override def releaseHosts(releaseHostsRequest: ReleaseHostsRequest): ReleaseHostsResult = ???

  override def replaceIamInstanceProfileAssociation(replaceIamInstanceProfileAssociationRequest: ReplaceIamInstanceProfileAssociationRequest): ReplaceIamInstanceProfileAssociationResult = ???

  override def replaceNetworkAclAssociation(replaceNetworkAclAssociationRequest: ReplaceNetworkAclAssociationRequest): ReplaceNetworkAclAssociationResult = ???

  override def replaceNetworkAclEntry(replaceNetworkAclEntryRequest: ReplaceNetworkAclEntryRequest): ReplaceNetworkAclEntryResult = ???

  override def replaceRoute(replaceRouteRequest: ReplaceRouteRequest): ReplaceRouteResult = ???

  override def replaceRouteTableAssociation(replaceRouteTableAssociationRequest: ReplaceRouteTableAssociationRequest): ReplaceRouteTableAssociationResult = ???

  override def reportInstanceStatus(reportInstanceStatusRequest: ReportInstanceStatusRequest): ReportInstanceStatusResult = ???

  override def requestSpotFleet(requestSpotFleetRequest: RequestSpotFleetRequest): RequestSpotFleetResult = ???

  override def requestSpotInstances(requestSpotInstancesRequest: RequestSpotInstancesRequest): RequestSpotInstancesResult = ???

  override def resetFpgaImageAttribute(resetFpgaImageAttributeRequest: ResetFpgaImageAttributeRequest): ResetFpgaImageAttributeResult = ???

  override def resetImageAttribute(resetImageAttributeRequest: ResetImageAttributeRequest): ResetImageAttributeResult = ???

  override def resetInstanceAttribute(resetInstanceAttributeRequest: ResetInstanceAttributeRequest): ResetInstanceAttributeResult = ???

  override def resetNetworkInterfaceAttribute(resetNetworkInterfaceAttributeRequest: ResetNetworkInterfaceAttributeRequest): ResetNetworkInterfaceAttributeResult = ???

  override def resetSnapshotAttribute(resetSnapshotAttributeRequest: ResetSnapshotAttributeRequest): ResetSnapshotAttributeResult = ???

  override def restoreAddressToClassic(restoreAddressToClassicRequest: RestoreAddressToClassicRequest): RestoreAddressToClassicResult = ???

  override def revokeSecurityGroupEgress(revokeSecurityGroupEgressRequest: RevokeSecurityGroupEgressRequest): RevokeSecurityGroupEgressResult = ???

  override def revokeSecurityGroupIngress(revokeSecurityGroupIngressRequest: RevokeSecurityGroupIngressRequest): RevokeSecurityGroupIngressResult = ???

  override def revokeSecurityGroupIngress(): RevokeSecurityGroupIngressResult = ???

  override def runInstances(runInstancesRequest: RunInstancesRequest): RunInstancesResult = ???

  override def runScheduledInstances(runScheduledInstancesRequest: RunScheduledInstancesRequest): RunScheduledInstancesResult = ???

  override def startInstances(startInstancesRequest: StartInstancesRequest): StartInstancesResult = ???

  override def stopInstances(stopInstancesRequest: StopInstancesRequest): StopInstancesResult = ???

  override def terminateInstances(terminateInstancesRequest: TerminateInstancesRequest): TerminateInstancesResult = ???

  override def unassignIpv6Addresses(unassignIpv6AddressesRequest: UnassignIpv6AddressesRequest): UnassignIpv6AddressesResult = ???

  override def unassignPrivateIpAddresses(unassignPrivateIpAddressesRequest: UnassignPrivateIpAddressesRequest): UnassignPrivateIpAddressesResult = ???

  override def unmonitorInstances(unmonitorInstancesRequest: UnmonitorInstancesRequest): UnmonitorInstancesResult = ???

  override def updateSecurityGroupRuleDescriptionsEgress(updateSecurityGroupRuleDescriptionsEgressRequest: UpdateSecurityGroupRuleDescriptionsEgressRequest): UpdateSecurityGroupRuleDescriptionsEgressResult = ???

  override def updateSecurityGroupRuleDescriptionsIngress(updateSecurityGroupRuleDescriptionsIngressRequest: UpdateSecurityGroupRuleDescriptionsIngressRequest): UpdateSecurityGroupRuleDescriptionsIngressResult = ???

  override def dryRun[X <: AmazonWebServiceRequest](request: DryRunSupportedRequest[X]): DryRunResult[X] = ???

  override def shutdown(): Unit = ???

  override def getCachedResponseMetadata(request: AmazonWebServiceRequest): ResponseMetadata = ???

  override def waiters(): AmazonEC2Waiters = ???
}
