/*
 * generated by Xtext 2.25.0
 */
package org.lowcomote.panoptes.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.lowcomote.panoptes.ide.contentassist.antlr.internal.InternalPanoptesXParser;
import org.lowcomote.panoptes.services.PanoptesXGrammarAccess;

public class PanoptesXParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(PanoptesXGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, PanoptesXGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getPlatformAccess().getAlternatives(), "rule__Platform__Alternatives");
			builder.put(grammarAccess.getModelAccess().getNameAlternatives_2_0(), "rule__Model__NameAlternatives_2_0");
			builder.put(grammarAccess.getEntityAccess().getNameAlternatives_0_0(), "rule__Entity__NameAlternatives_0_0");
			builder.put(grammarAccess.getModelIOAccess().getAlternatives(), "rule__ModelIO__Alternatives");
			builder.put(grammarAccess.getFeatureAccess().getNameAlternatives_0_0(), "rule__Feature__NameAlternatives_0_0");
			builder.put(grammarAccess.getPredictionAccess().getNameAlternatives_1_0(), "rule__Prediction__NameAlternatives_1_0");
			builder.put(grammarAccess.getLabelAccess().getNameAlternatives_1_0(), "rule__Label__NameAlternatives_1_0");
			builder.put(grammarAccess.getDeploymentIOAccess().getAlternatives(), "rule__DeploymentIO__Alternatives");
			builder.put(grammarAccess.getRequestDataAccess().getNameAlternatives_1_0(), "rule__RequestData__NameAlternatives_1_0");
			builder.put(grammarAccess.getKeyAccess().getNameAlternatives_1_0(), "rule__Key__NameAlternatives_1_0");
			builder.put(grammarAccess.getDeploymentAccess().getNameAlternatives_1_0(), "rule__Deployment__NameAlternatives_1_0");
			builder.put(grammarAccess.getDeploymentAccess().getAlternatives_3(), "rule__Deployment__Alternatives_3");
			builder.put(grammarAccess.getAlgorithmAccess().getAlternatives(), "rule__Algorithm__Alternatives");
			builder.put(grammarAccess.getBaseAlgorithmAccess().getNameAlternatives_1_0(), "rule__BaseAlgorithm__NameAlternatives_1_0");
			builder.put(grammarAccess.getBaseAlgorithmAccess().getCodebaseAlternatives_3_0_1_0(), "rule__BaseAlgorithm__CodebaseAlternatives_3_0_1_0");
			builder.put(grammarAccess.getHigherOrderAlgorithmAccess().getNameAlternatives_2_0(), "rule__HigherOrderAlgorithm__NameAlternatives_2_0");
			builder.put(grammarAccess.getHigherOrderAlgorithmAccess().getCodebaseAlternatives_4_0_1_0(), "rule__HigherOrderAlgorithm__CodebaseAlternatives_4_0_1_0");
			builder.put(grammarAccess.getAlgorithmRuntimeAccess().getAlternatives(), "rule__AlgorithmRuntime__Alternatives");
			builder.put(grammarAccess.getBaseAlgorithmRuntimeAccess().getNameAlternatives_2_0(), "rule__BaseAlgorithmRuntime__NameAlternatives_2_0");
			builder.put(grammarAccess.getBaseAlgorithmRuntimeAccess().getEndpointAlternatives_3_2_0(), "rule__BaseAlgorithmRuntime__EndpointAlternatives_3_2_0");
			builder.put(grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getNameAlternatives_2_0(), "rule__HigherOrderAlgorithmRuntime__NameAlternatives_2_0");
			builder.put(grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getEndpointAlternatives_3_2_0(), "rule__HigherOrderAlgorithmRuntime__EndpointAlternatives_3_2_0");
			builder.put(grammarAccess.getAlgorithmExecutionAccess().getAlternatives(), "rule__AlgorithmExecution__Alternatives");
			builder.put(grammarAccess.getBaseAlgorithmExecutionAccess().getNameAlternatives_2_0(), "rule__BaseAlgorithmExecution__NameAlternatives_2_0");
			builder.put(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getNameAlternatives_2_0(), "rule__HigherOrderAlgorithmExecution__NameAlternatives_2_0");
			builder.put(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getAlternatives_4_3_0(), "rule__HigherOrderAlgorithmExecution__Alternatives_4_3_0");
			builder.put(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getAlternatives_4_4_0(), "rule__HigherOrderAlgorithmExecution__Alternatives_4_4_0");
			builder.put(grammarAccess.getTriggerGroupAccess().getNameAlternatives_2_0(), "rule__TriggerGroup__NameAlternatives_2_0");
			builder.put(grammarAccess.getTemporalTriggerAccess().getAlternatives(), "rule__TemporalTrigger__Alternatives");
			builder.put(grammarAccess.getActionAccess().getNameAlternatives_2_0(), "rule__Action__NameAlternatives_2_0");
			builder.put(grammarAccess.getActionAccess().getEndpointAlternatives_4_0_1_0(), "rule__Action__EndpointAlternatives_4_0_1_0");
			builder.put(grammarAccess.getParameterAccess().getNameAlternatives_2_0(), "rule__Parameter__NameAlternatives_2_0");
			builder.put(grammarAccess.getParameterValueEntryAccess().getKeyAlternatives_1_0(), "rule__ParameterValueEntry__KeyAlternatives_1_0");
			builder.put(grammarAccess.getActionExecutionAccess().getNameAlternatives_2_0(), "rule__ActionExecution__NameAlternatives_2_0");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getStatisticalVariableTypeAccess().getAlternatives(), "rule__StatisticalVariableType__Alternatives");
			builder.put(grammarAccess.getFrequencyEnumAccess().getAlternatives(), "rule__FrequencyEnum__Alternatives");
			builder.put(grammarAccess.getParameterTypeAccess().getAlternatives(), "rule__ParameterType__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getModelAccess().getGroup_4_0(), "rule__Model__Group_4_0__0");
			builder.put(grammarAccess.getModelAccess().getGroup_4_0_2(), "rule__Model__Group_4_0_2__0");
			builder.put(grammarAccess.getModelAccess().getGroup_4_1(), "rule__Model__Group_4_1__0");
			builder.put(grammarAccess.getFeatureStoreAccess().getGroup(), "rule__FeatureStore__Group__0");
			builder.put(grammarAccess.getFeatureStoreAccess().getGroup_3_0(), "rule__FeatureStore__Group_3_0__0");
			builder.put(grammarAccess.getFeatureStoreAccess().getGroup_3_0_2(), "rule__FeatureStore__Group_3_0_2__0");
			builder.put(grammarAccess.getFeatureStoreAccess().getGroup_3_1(), "rule__FeatureStore__Group_3_1__0");
			builder.put(grammarAccess.getFeatureStoreAccess().getGroup_3_1_2(), "rule__FeatureStore__Group_3_1_2__0");
			builder.put(grammarAccess.getFeatureStoreAccess().getGroup_3_2(), "rule__FeatureStore__Group_3_2__0");
			builder.put(grammarAccess.getFeatureStoreAccess().getGroup_3_2_2(), "rule__FeatureStore__Group_3_2_2__0");
			builder.put(grammarAccess.getFeatureStoreAccess().getGroup_3_3(), "rule__FeatureStore__Group_3_3__0");
			builder.put(grammarAccess.getFeatureStoreAccess().getGroup_3_3_3(), "rule__FeatureStore__Group_3_3_3__0");
			builder.put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_4(), "rule__Entity__Group_4__0");
			builder.put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
			builder.put(grammarAccess.getFeatureAccess().getGroup_1(), "rule__Feature__Group_1__0");
			builder.put(grammarAccess.getFeatureAccess().getGroup_2(), "rule__Feature__Group_2__0");
			builder.put(grammarAccess.getFeatureAccess().getGroup_2_1_0(), "rule__Feature__Group_2_1_0__0");
			builder.put(grammarAccess.getFeatureAccess().getGroup_2_1_0_3(), "rule__Feature__Group_2_1_0_3__0");
			builder.put(grammarAccess.getFeatureAccess().getGroup_2_1_1(), "rule__Feature__Group_2_1_1__0");
			builder.put(grammarAccess.getFeatureAccess().getGroup_2_1_1_4(), "rule__Feature__Group_2_1_1_4__0");
			builder.put(grammarAccess.getPredictionAccess().getGroup(), "rule__Prediction__Group__0");
			builder.put(grammarAccess.getPredictionAccess().getGroup_2(), "rule__Prediction__Group_2__0");
			builder.put(grammarAccess.getLabelAccess().getGroup(), "rule__Label__Group__0");
			builder.put(grammarAccess.getLabelAccess().getGroup_2(), "rule__Label__Group_2__0");
			builder.put(grammarAccess.getRequestDataAccess().getGroup(), "rule__RequestData__Group__0");
			builder.put(grammarAccess.getKeyAccess().getGroup(), "rule__Key__Group__0");
			builder.put(grammarAccess.getDeploymentAccess().getGroup(), "rule__Deployment__Group__0");
			builder.put(grammarAccess.getDeploymentAccess().getGroup_3_0(), "rule__Deployment__Group_3_0__0");
			builder.put(grammarAccess.getDeploymentAccess().getGroup_3_1(), "rule__Deployment__Group_3_1__0");
			builder.put(grammarAccess.getDeploymentAccess().getGroup_3_1_2(), "rule__Deployment__Group_3_1_2__0");
			builder.put(grammarAccess.getBaseAlgorithmAccess().getGroup(), "rule__BaseAlgorithm__Group__0");
			builder.put(grammarAccess.getBaseAlgorithmAccess().getGroup_3_0(), "rule__BaseAlgorithm__Group_3_0__0");
			builder.put(grammarAccess.getBaseAlgorithmAccess().getGroup_3_1(), "rule__BaseAlgorithm__Group_3_1__0");
			builder.put(grammarAccess.getBaseAlgorithmAccess().getGroup_3_2(), "rule__BaseAlgorithm__Group_3_2__0");
			builder.put(grammarAccess.getBaseAlgorithmAccess().getGroup_3_3(), "rule__BaseAlgorithm__Group_3_3__0");
			builder.put(grammarAccess.getBaseAlgorithmAccess().getGroup_3_3_3(), "rule__BaseAlgorithm__Group_3_3_3__0");
			builder.put(grammarAccess.getBaseAlgorithmAccess().getGroup_3_4(), "rule__BaseAlgorithm__Group_3_4__0");
			builder.put(grammarAccess.getBaseAlgorithmAccess().getGroup_3_4_2(), "rule__BaseAlgorithm__Group_3_4_2__0");
			builder.put(grammarAccess.getHigherOrderAlgorithmAccess().getGroup(), "rule__HigherOrderAlgorithm__Group__0");
			builder.put(grammarAccess.getHigherOrderAlgorithmAccess().getGroup_4_0(), "rule__HigherOrderAlgorithm__Group_4_0__0");
			builder.put(grammarAccess.getHigherOrderAlgorithmAccess().getGroup_4_1(), "rule__HigherOrderAlgorithm__Group_4_1__0");
			builder.put(grammarAccess.getHigherOrderAlgorithmAccess().getGroup_4_2(), "rule__HigherOrderAlgorithm__Group_4_2__0");
			builder.put(grammarAccess.getHigherOrderAlgorithmAccess().getGroup_4_3(), "rule__HigherOrderAlgorithm__Group_4_3__0");
			builder.put(grammarAccess.getHigherOrderAlgorithmAccess().getGroup_4_3_2(), "rule__HigherOrderAlgorithm__Group_4_3_2__0");
			builder.put(grammarAccess.getBaseAlgorithmRuntimeAccess().getGroup(), "rule__BaseAlgorithmRuntime__Group__0");
			builder.put(grammarAccess.getBaseAlgorithmRuntimeAccess().getGroup_3(), "rule__BaseAlgorithmRuntime__Group_3__0");
			builder.put(grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getGroup(), "rule__HigherOrderAlgorithmRuntime__Group__0");
			builder.put(grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getGroup_3(), "rule__HigherOrderAlgorithmRuntime__Group_3__0");
			builder.put(grammarAccess.getBaseAlgorithmExecutionAccess().getGroup(), "rule__BaseAlgorithmExecution__Group__0");
			builder.put(grammarAccess.getBaseAlgorithmExecutionAccess().getGroup_4_0(), "rule__BaseAlgorithmExecution__Group_4_0__0");
			builder.put(grammarAccess.getBaseAlgorithmExecutionAccess().getGroup_4_1(), "rule__BaseAlgorithmExecution__Group_4_1__0");
			builder.put(grammarAccess.getBaseAlgorithmExecutionAccess().getGroup_4_1_3(), "rule__BaseAlgorithmExecution__Group_4_1_3__0");
			builder.put(grammarAccess.getBaseAlgorithmExecutionAccess().getGroup_4_2(), "rule__BaseAlgorithmExecution__Group_4_2__0");
			builder.put(grammarAccess.getBaseAlgorithmExecutionAccess().getGroup_4_2_3(), "rule__BaseAlgorithmExecution__Group_4_2_3__0");
			builder.put(grammarAccess.getBaseAlgorithmExecutionAccess().getGroup_4_3(), "rule__BaseAlgorithmExecution__Group_4_3__0");
			builder.put(grammarAccess.getBaseAlgorithmExecutionAccess().getGroup_4_3_2(), "rule__BaseAlgorithmExecution__Group_4_3_2__0");
			builder.put(grammarAccess.getBaseAlgorithmExecutionAccess().getGroup_4_4(), "rule__BaseAlgorithmExecution__Group_4_4__0");
			builder.put(grammarAccess.getBaseAlgorithmExecutionAccess().getGroup_4_4_3(), "rule__BaseAlgorithmExecution__Group_4_4_3__0");
			builder.put(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getGroup(), "rule__HigherOrderAlgorithmExecution__Group__0");
			builder.put(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getGroup_4_0(), "rule__HigherOrderAlgorithmExecution__Group_4_0__0");
			builder.put(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getGroup_4_1(), "rule__HigherOrderAlgorithmExecution__Group_4_1__0");
			builder.put(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getGroup_4_2(), "rule__HigherOrderAlgorithmExecution__Group_4_2__0");
			builder.put(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getGroup_4_2_2(), "rule__HigherOrderAlgorithmExecution__Group_4_2_2__0");
			builder.put(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getGroup_4_3(), "rule__HigherOrderAlgorithmExecution__Group_4_3__0");
			builder.put(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getGroup_4_4(), "rule__HigherOrderAlgorithmExecution__Group_4_4__0");
			builder.put(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getGroup_4_5(), "rule__HigherOrderAlgorithmExecution__Group_4_5__0");
			builder.put(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getGroup_4_5_3(), "rule__HigherOrderAlgorithmExecution__Group_4_5_3__0");
			builder.put(grammarAccess.getActionExecutionEntryAccess().getGroup(), "rule__ActionExecutionEntry__Group__0");
			builder.put(grammarAccess.getTriggerGroupAccess().getGroup(), "rule__TriggerGroup__Group__0");
			builder.put(grammarAccess.getTriggerGroupAccess().getGroup_5(), "rule__TriggerGroup__Group_5__0");
			builder.put(grammarAccess.getTriggerGroupAccess().getGroup_8(), "rule__TriggerGroup__Group_8__0");
			builder.put(grammarAccess.getCompositeTriggerAccess().getGroup(), "rule__CompositeTrigger__Group__0");
			builder.put(grammarAccess.getTemporalTriggerAccess().getGroup_0(), "rule__TemporalTrigger__Group_0__0");
			builder.put(grammarAccess.getTemporalTriggerAccess().getGroup_0_1(), "rule__TemporalTrigger__Group_0_1__0");
			builder.put(grammarAccess.getSampleBasedTriggerAccess().getGroup(), "rule__SampleBasedTrigger__Group__0");
			builder.put(grammarAccess.getPredictionBasedTriggerAccess().getGroup(), "rule__PredictionBasedTrigger__Group__0");
			builder.put(grammarAccess.getLabelBasedTriggerAccess().getGroup(), "rule__LabelBasedTrigger__Group__0");
			builder.put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
			builder.put(grammarAccess.getActionAccess().getGroup_4_0(), "rule__Action__Group_4_0__0");
			builder.put(grammarAccess.getActionAccess().getGroup_4_1(), "rule__Action__Group_4_1__0");
			builder.put(grammarAccess.getActionAccess().getGroup_4_1_2(), "rule__Action__Group_4_1_2__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_3(), "rule__Parameter__Group_3__0");
			builder.put(grammarAccess.getParameterValueEntryAccess().getGroup(), "rule__ParameterValueEntry__Group__0");
			builder.put(grammarAccess.getActionExecutionAccess().getGroup(), "rule__ActionExecution__Group__0");
			builder.put(grammarAccess.getActionExecutionAccess().getGroup_4_0(), "rule__ActionExecution__Group_4_0__0");
			builder.put(grammarAccess.getActionExecutionAccess().getGroup_4_1(), "rule__ActionExecution__Group_4_1__0");
			builder.put(grammarAccess.getActionExecutionAccess().getGroup_4_1_3(), "rule__ActionExecution__Group_4_1_3__0");
			builder.put(grammarAccess.getPlatformAccess().getFeatureStoreAssignment_0(), "rule__Platform__FeatureStoreAssignment_0");
			builder.put(grammarAccess.getPlatformAccess().getMlModelsAssignment_1(), "rule__Platform__MlModelsAssignment_1");
			builder.put(grammarAccess.getPlatformAccess().getDeploymentsAssignment_2(), "rule__Platform__DeploymentsAssignment_2");
			builder.put(grammarAccess.getPlatformAccess().getAlgorithmsAssignment_3(), "rule__Platform__AlgorithmsAssignment_3");
			builder.put(grammarAccess.getPlatformAccess().getAlgorithmRuntimesAssignment_4(), "rule__Platform__AlgorithmRuntimesAssignment_4");
			builder.put(grammarAccess.getPlatformAccess().getActionsAssignment_5(), "rule__Platform__ActionsAssignment_5");
			builder.put(grammarAccess.getModelAccess().getNameAssignment_2(), "rule__Model__NameAssignment_2");
			builder.put(grammarAccess.getModelAccess().getInputsAssignment_4_0_1(), "rule__Model__InputsAssignment_4_0_1");
			builder.put(grammarAccess.getModelAccess().getInputsAssignment_4_0_2_1(), "rule__Model__InputsAssignment_4_0_2_1");
			builder.put(grammarAccess.getModelAccess().getOutputAssignment_4_1_1(), "rule__Model__OutputAssignment_4_1_1");
			builder.put(grammarAccess.getFeatureStoreAccess().getFeaturesAssignment_3_0_1(), "rule__FeatureStore__FeaturesAssignment_3_0_1");
			builder.put(grammarAccess.getFeatureStoreAccess().getFeaturesAssignment_3_0_2_1(), "rule__FeatureStore__FeaturesAssignment_3_0_2_1");
			builder.put(grammarAccess.getFeatureStoreAccess().getEntitiesAssignment_3_1_1(), "rule__FeatureStore__EntitiesAssignment_3_1_1");
			builder.put(grammarAccess.getFeatureStoreAccess().getEntitiesAssignment_3_1_2_1(), "rule__FeatureStore__EntitiesAssignment_3_1_2_1");
			builder.put(grammarAccess.getFeatureStoreAccess().getLabelsAssignment_3_2_1(), "rule__FeatureStore__LabelsAssignment_3_2_1");
			builder.put(grammarAccess.getFeatureStoreAccess().getLabelsAssignment_3_2_2_1(), "rule__FeatureStore__LabelsAssignment_3_2_2_1");
			builder.put(grammarAccess.getFeatureStoreAccess().getRequestDataAssignment_3_3_2(), "rule__FeatureStore__RequestDataAssignment_3_3_2");
			builder.put(grammarAccess.getFeatureStoreAccess().getRequestDataAssignment_3_3_3_1(), "rule__FeatureStore__RequestDataAssignment_3_3_3_1");
			builder.put(grammarAccess.getEntityAccess().getNameAssignment_0(), "rule__Entity__NameAssignment_0");
			builder.put(grammarAccess.getEntityAccess().getKeysAssignment_3(), "rule__Entity__KeysAssignment_3");
			builder.put(grammarAccess.getEntityAccess().getKeysAssignment_4_1(), "rule__Entity__KeysAssignment_4_1");
			builder.put(grammarAccess.getFeatureAccess().getNameAssignment_0(), "rule__Feature__NameAssignment_0");
			builder.put(grammarAccess.getFeatureAccess().getTypeAssignment_1_1(), "rule__Feature__TypeAssignment_1_1");
			builder.put(grammarAccess.getFeatureAccess().getEntitiesAssignment_2_1_0_2(), "rule__Feature__EntitiesAssignment_2_1_0_2");
			builder.put(grammarAccess.getFeatureAccess().getEntitiesAssignment_2_1_0_3_1(), "rule__Feature__EntitiesAssignment_2_1_0_3_1");
			builder.put(grammarAccess.getFeatureAccess().getRequestDataAssignment_2_1_1_3(), "rule__Feature__RequestDataAssignment_2_1_1_3");
			builder.put(grammarAccess.getFeatureAccess().getRequestDataAssignment_2_1_1_4_1(), "rule__Feature__RequestDataAssignment_2_1_1_4_1");
			builder.put(grammarAccess.getPredictionAccess().getNameAssignment_1(), "rule__Prediction__NameAssignment_1");
			builder.put(grammarAccess.getPredictionAccess().getLabelAssignment_2_1(), "rule__Prediction__LabelAssignment_2_1");
			builder.put(grammarAccess.getLabelAccess().getNameAssignment_1(), "rule__Label__NameAssignment_1");
			builder.put(grammarAccess.getLabelAccess().getTypeAssignment_2_1(), "rule__Label__TypeAssignment_2_1");
			builder.put(grammarAccess.getRequestDataAccess().getNameAssignment_1(), "rule__RequestData__NameAssignment_1");
			builder.put(grammarAccess.getKeyAccess().getNameAssignment_1(), "rule__Key__NameAssignment_1");
			builder.put(grammarAccess.getDeploymentAccess().getNameAssignment_1(), "rule__Deployment__NameAssignment_1");
			builder.put(grammarAccess.getDeploymentAccess().getMlModelAssignment_3_0_1(), "rule__Deployment__MlModelAssignment_3_0_1");
			builder.put(grammarAccess.getDeploymentAccess().getInputsAssignment_3_1_1(), "rule__Deployment__InputsAssignment_3_1_1");
			builder.put(grammarAccess.getDeploymentAccess().getInputsAssignment_3_1_2_1(), "rule__Deployment__InputsAssignment_3_1_2_1");
			builder.put(grammarAccess.getDeploymentAccess().getAlgorithmexecutionsAssignment_3_2(), "rule__Deployment__AlgorithmexecutionsAssignment_3_2");
			builder.put(grammarAccess.getDeploymentAccess().getActionExecutionsAssignment_3_3(), "rule__Deployment__ActionExecutionsAssignment_3_3");
			builder.put(grammarAccess.getDeploymentAccess().getTriggerGroupsAssignment_3_4(), "rule__Deployment__TriggerGroupsAssignment_3_4");
			builder.put(grammarAccess.getBaseAlgorithmAccess().getNameAssignment_1(), "rule__BaseAlgorithm__NameAssignment_1");
			builder.put(grammarAccess.getBaseAlgorithmAccess().getCodebaseAssignment_3_0_1(), "rule__BaseAlgorithm__CodebaseAssignment_3_0_1");
			builder.put(grammarAccess.getBaseAlgorithmAccess().getRuntimeAssignment_3_1_1(), "rule__BaseAlgorithm__RuntimeAssignment_3_1_1");
			builder.put(grammarAccess.getBaseAlgorithmAccess().getDriftLevelsAssignment_3_2_2(), "rule__BaseAlgorithm__DriftLevelsAssignment_3_2_2");
			builder.put(grammarAccess.getBaseAlgorithmAccess().getStrictAssignment_3_3_1(), "rule__BaseAlgorithm__StrictAssignment_3_3_1");
			builder.put(grammarAccess.getBaseAlgorithmAccess().getSupportedTypesAssignment_3_3_2(), "rule__BaseAlgorithm__SupportedTypesAssignment_3_3_2");
			builder.put(grammarAccess.getBaseAlgorithmAccess().getSupportedTypesAssignment_3_3_3_1(), "rule__BaseAlgorithm__SupportedTypesAssignment_3_3_3_1");
			builder.put(grammarAccess.getBaseAlgorithmAccess().getAdditionalParametersAssignment_3_4_1(), "rule__BaseAlgorithm__AdditionalParametersAssignment_3_4_1");
			builder.put(grammarAccess.getBaseAlgorithmAccess().getAdditionalParametersAssignment_3_4_2_1(), "rule__BaseAlgorithm__AdditionalParametersAssignment_3_4_2_1");
			builder.put(grammarAccess.getHigherOrderAlgorithmAccess().getNameAssignment_2(), "rule__HigherOrderAlgorithm__NameAssignment_2");
			builder.put(grammarAccess.getHigherOrderAlgorithmAccess().getCodebaseAssignment_4_0_1(), "rule__HigherOrderAlgorithm__CodebaseAssignment_4_0_1");
			builder.put(grammarAccess.getHigherOrderAlgorithmAccess().getRuntimeAssignment_4_1_1(), "rule__HigherOrderAlgorithm__RuntimeAssignment_4_1_1");
			builder.put(grammarAccess.getHigherOrderAlgorithmAccess().getDriftLevelsAssignment_4_2_2(), "rule__HigherOrderAlgorithm__DriftLevelsAssignment_4_2_2");
			builder.put(grammarAccess.getHigherOrderAlgorithmAccess().getAdditionalParametersAssignment_4_3_1(), "rule__HigherOrderAlgorithm__AdditionalParametersAssignment_4_3_1");
			builder.put(grammarAccess.getHigherOrderAlgorithmAccess().getAdditionalParametersAssignment_4_3_2_1(), "rule__HigherOrderAlgorithm__AdditionalParametersAssignment_4_3_2_1");
			builder.put(grammarAccess.getBaseAlgorithmRuntimeAccess().getNameAssignment_2(), "rule__BaseAlgorithmRuntime__NameAssignment_2");
			builder.put(grammarAccess.getBaseAlgorithmRuntimeAccess().getEndpointAssignment_3_2(), "rule__BaseAlgorithmRuntime__EndpointAssignment_3_2");
			builder.put(grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getNameAssignment_2(), "rule__HigherOrderAlgorithmRuntime__NameAssignment_2");
			builder.put(grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getEndpointAssignment_3_2(), "rule__HigherOrderAlgorithmRuntime__EndpointAssignment_3_2");
			builder.put(grammarAccess.getBaseAlgorithmExecutionAccess().getNameAssignment_2(), "rule__BaseAlgorithmExecution__NameAssignment_2");
			builder.put(grammarAccess.getBaseAlgorithmExecutionAccess().getAlgorithmAssignment_4_0_1(), "rule__BaseAlgorithmExecution__AlgorithmAssignment_4_0_1");
			builder.put(grammarAccess.getBaseAlgorithmExecutionAccess().getCurrentIOValuesAssignment_4_1_2(), "rule__BaseAlgorithmExecution__CurrentIOValuesAssignment_4_1_2");
			builder.put(grammarAccess.getBaseAlgorithmExecutionAccess().getCurrentIOValuesAssignment_4_1_3_1(), "rule__BaseAlgorithmExecution__CurrentIOValuesAssignment_4_1_3_1");
			builder.put(grammarAccess.getBaseAlgorithmExecutionAccess().getHistoricIOValuesAssignment_4_2_2(), "rule__BaseAlgorithmExecution__HistoricIOValuesAssignment_4_2_2");
			builder.put(grammarAccess.getBaseAlgorithmExecutionAccess().getHistoricIOValuesAssignment_4_2_3_1(), "rule__BaseAlgorithmExecution__HistoricIOValuesAssignment_4_2_3_1");
			builder.put(grammarAccess.getBaseAlgorithmExecutionAccess().getActionExecutionMapAssignment_4_3_1(), "rule__BaseAlgorithmExecution__ActionExecutionMapAssignment_4_3_1");
			builder.put(grammarAccess.getBaseAlgorithmExecutionAccess().getActionExecutionMapAssignment_4_3_2_1(), "rule__BaseAlgorithmExecution__ActionExecutionMapAssignment_4_3_2_1");
			builder.put(grammarAccess.getBaseAlgorithmExecutionAccess().getParameterValueMapAssignment_4_4_2(), "rule__BaseAlgorithmExecution__ParameterValueMapAssignment_4_4_2");
			builder.put(grammarAccess.getBaseAlgorithmExecutionAccess().getParameterValueMapAssignment_4_4_3_1(), "rule__BaseAlgorithmExecution__ParameterValueMapAssignment_4_4_3_1");
			builder.put(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getNameAssignment_2(), "rule__HigherOrderAlgorithmExecution__NameAssignment_2");
			builder.put(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getAlgorithmAssignment_4_0_1(), "rule__HigherOrderAlgorithmExecution__AlgorithmAssignment_4_0_1");
			builder.put(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getAlgorithmExecutionAssignment_4_1_2(), "rule__HigherOrderAlgorithmExecution__AlgorithmExecutionAssignment_4_1_2");
			builder.put(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getActionExecutionMapAssignment_4_2_1(), "rule__HigherOrderAlgorithmExecution__ActionExecutionMapAssignment_4_2_1");
			builder.put(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getActionExecutionMapAssignment_4_2_2_1(), "rule__HigherOrderAlgorithmExecution__ActionExecutionMapAssignment_4_2_2_1");
			builder.put(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getMinDataPointsAssignment_4_3_2(), "rule__HigherOrderAlgorithmExecution__MinDataPointsAssignment_4_3_2");
			builder.put(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getMaxDataPointsAssignment_4_4_2(), "rule__HigherOrderAlgorithmExecution__MaxDataPointsAssignment_4_4_2");
			builder.put(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getParameterValueMapAssignment_4_5_2(), "rule__HigherOrderAlgorithmExecution__ParameterValueMapAssignment_4_5_2");
			builder.put(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getParameterValueMapAssignment_4_5_3_1(), "rule__HigherOrderAlgorithmExecution__ParameterValueMapAssignment_4_5_3_1");
			builder.put(grammarAccess.getActionExecutionEntryAccess().getKeyAssignment_1(), "rule__ActionExecutionEntry__KeyAssignment_1");
			builder.put(grammarAccess.getActionExecutionEntryAccess().getValueAssignment_3(), "rule__ActionExecutionEntry__ValueAssignment_3");
			builder.put(grammarAccess.getTriggerGroupAccess().getNameAssignment_2(), "rule__TriggerGroup__NameAssignment_2");
			builder.put(grammarAccess.getTriggerGroupAccess().getCompositeTriggersAssignment_4(), "rule__TriggerGroup__CompositeTriggersAssignment_4");
			builder.put(grammarAccess.getTriggerGroupAccess().getCompositeTriggersAssignment_5_1(), "rule__TriggerGroup__CompositeTriggersAssignment_5_1");
			builder.put(grammarAccess.getTriggerGroupAccess().getTargetsAssignment_7(), "rule__TriggerGroup__TargetsAssignment_7");
			builder.put(grammarAccess.getTriggerGroupAccess().getTargetsAssignment_8_1(), "rule__TriggerGroup__TargetsAssignment_8_1");
			builder.put(grammarAccess.getCompositeTriggerAccess().getTtAssignment_2_0(), "rule__CompositeTrigger__TtAssignment_2_0");
			builder.put(grammarAccess.getCompositeTriggerAccess().getStAssignment_2_1(), "rule__CompositeTrigger__StAssignment_2_1");
			builder.put(grammarAccess.getCompositeTriggerAccess().getPtAssignment_2_2(), "rule__CompositeTrigger__PtAssignment_2_2");
			builder.put(grammarAccess.getCompositeTriggerAccess().getLtAssignment_2_3(), "rule__CompositeTrigger__LtAssignment_2_3");
			builder.put(grammarAccess.getTemporalTriggerAccess().getFrequencyAssignment_0_1_1(), "rule__TemporalTrigger__FrequencyAssignment_0_1_1");
			builder.put(grammarAccess.getTemporalTriggerAccess().getCronStringAssignment_1(), "rule__TemporalTrigger__CronStringAssignment_1");
			builder.put(grammarAccess.getSampleBasedTriggerAccess().getFrequencyAssignment_1(), "rule__SampleBasedTrigger__FrequencyAssignment_1");
			builder.put(grammarAccess.getPredictionBasedTriggerAccess().getFrequencyAssignment_1(), "rule__PredictionBasedTrigger__FrequencyAssignment_1");
			builder.put(grammarAccess.getLabelBasedTriggerAccess().getFrequencyAssignment_1(), "rule__LabelBasedTrigger__FrequencyAssignment_1");
			builder.put(grammarAccess.getActionAccess().getNameAssignment_2(), "rule__Action__NameAssignment_2");
			builder.put(grammarAccess.getActionAccess().getEndpointAssignment_4_0_1(), "rule__Action__EndpointAssignment_4_0_1");
			builder.put(grammarAccess.getActionAccess().getAdditionalParametersAssignment_4_1_1(), "rule__Action__AdditionalParametersAssignment_4_1_1");
			builder.put(grammarAccess.getActionAccess().getAdditionalParametersAssignment_4_1_2_1(), "rule__Action__AdditionalParametersAssignment_4_1_2_1");
			builder.put(grammarAccess.getParameterAccess().getMandatoryAssignment_1(), "rule__Parameter__MandatoryAssignment_1");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_2(), "rule__Parameter__NameAssignment_2");
			builder.put(grammarAccess.getParameterAccess().getTypeAssignment_3_1(), "rule__Parameter__TypeAssignment_3_1");
			builder.put(grammarAccess.getParameterValueEntryAccess().getKeyAssignment_1(), "rule__ParameterValueEntry__KeyAssignment_1");
			builder.put(grammarAccess.getParameterValueEntryAccess().getValueAssignment_3(), "rule__ParameterValueEntry__ValueAssignment_3");
			builder.put(grammarAccess.getActionExecutionAccess().getNameAssignment_2(), "rule__ActionExecution__NameAssignment_2");
			builder.put(grammarAccess.getActionExecutionAccess().getActionAssignment_4_0_1(), "rule__ActionExecution__ActionAssignment_4_0_1");
			builder.put(grammarAccess.getActionExecutionAccess().getParameterValueMapAssignment_4_1_2(), "rule__ActionExecution__ParameterValueMapAssignment_4_1_2");
			builder.put(grammarAccess.getActionExecutionAccess().getParameterValueMapAssignment_4_1_3_1(), "rule__ActionExecution__ParameterValueMapAssignment_4_1_3_1");
			builder.put(grammarAccess.getModelAccess().getUnorderedGroup_4(), "rule__Model__UnorderedGroup_4");
			builder.put(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), "rule__FeatureStore__UnorderedGroup_3");
			builder.put(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1(), "rule__Feature__UnorderedGroup_2_1");
			builder.put(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), "rule__BaseAlgorithm__UnorderedGroup_3");
			builder.put(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), "rule__HigherOrderAlgorithm__UnorderedGroup_4");
			builder.put(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), "rule__BaseAlgorithmExecution__UnorderedGroup_4");
			builder.put(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), "rule__HigherOrderAlgorithmExecution__UnorderedGroup_4");
			builder.put(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), "rule__CompositeTrigger__UnorderedGroup_2");
			builder.put(grammarAccess.getActionAccess().getUnorderedGroup_4(), "rule__Action__UnorderedGroup_4");
			builder.put(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4(), "rule__ActionExecution__UnorderedGroup_4");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private PanoptesXGrammarAccess grammarAccess;

	@Override
	protected InternalPanoptesXParser createParser() {
		InternalPanoptesXParser result = new InternalPanoptesXParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PanoptesXGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PanoptesXGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
